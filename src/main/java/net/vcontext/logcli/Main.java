package net.vcontext.logcli;

import java.io.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	static final Logger log = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		log.debug("I'm a debug log record");
		log.info("I'm an info log record");
	}
}
