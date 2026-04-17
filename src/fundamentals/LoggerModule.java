package fundamentals;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggerModule {
	private final Logger logger;

	public LoggerModule() {
		this(null);
	}

	public LoggerModule(Class<?> clazz) {

		String loggerName = (clazz != null) ? clazz.getName() : LoggerModule.class.getName();

		this.logger = Logger.getLogger(loggerName);
		this.logger.setUseParentHandlers(false);

		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.INFO);

//		Set formatter for customizing log output
		handler.setFormatter(new Formatter() {

			@Override
			public String format(LogRecord logRecord) {
				String className = logRecord.getLoggerName();

				if (className == null) {
					className = loggerName;
				}

				String level = logRecord.getLevel().getName();
				String message = logRecord.getMessage();

				return String.format("%1$tF %1$tT [%2$s] [%3$s] %4$s%n", new java.util.Date(logRecord.getMillis()),
						className, level, message);
			}
		});

		logger.addHandler(handler);
		logger.setLevel(handler.getLevel());
	}

	public void info(String msg) {
		logger.info(msg);
	}

	public void warning(String msg) {
		logger.warning(msg);
	}

	public void severe(String msg) {
		logger.severe(msg);
	}
}
