package com.mycompany.myapp;

import com.mycompany.myapp.ais.AISDataBasePojoListener;
import com.mycompany.myapp.ais.AISDataPojo;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import com.mycompany.myapp.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class JhipsterSampleApplicationApp {

  private static final Logger log = LoggerFactory.getLogger(JhipsterSampleApplicationApp.class);

  public static void main(String[] args) throws IOException {
    Environment env = SpringApplication.run(JhipsterSampleApplicationApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }

    File intputFile = new ClassPathResource("ais.csv").getFile();
    InputStream is = new FileInputStream(intputFile);

    CharStream input = CharStreams.fromStream(is);
    AISDataLexer lexer = new AISDataLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    var parser = new com.mycompany.myapp.ais.parser.AISDataParser(tokens);
    AISDataBasePojoListener aisDataBasePojoListener = new AISDataBasePojoListener();
    parser.addParseListener(aisDataBasePojoListener);
    ParseTree tree = parser.file();

    for (AISDataPojo aisDataPojo : aisDataBasePojoListener.getAisDataPojos()) {
      System.out.println(aisDataPojo);
    }
  }
}
