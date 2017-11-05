package com.saha.slnarch.di.module;

import com.saha.slnarch.common.file.FileHelper;
import com.saha.slnarch.common.file.FileParser;
import com.saha.slnarch.common.file.FileReader;
import com.saha.slnarch.common.file.FileWriter;
import javax.inject.Singleton;
import org.codejargon.feather.Provides;

public class CommonModule {

  @Provides
  @Singleton
  public FileParser provideFileParser(){
    return new FileHelper();
  }

  @Provides
  @Singleton
  public FileReader provideFileReader(){
    return new FileHelper();
  }

  @Provides
  @Singleton
  public FileWriter provideFileWrite(){
    return new FileHelper();
  }
}