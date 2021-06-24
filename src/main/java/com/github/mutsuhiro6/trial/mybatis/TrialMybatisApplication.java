package com.github.mutsuhiro6.trial.mybatis;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.mutsuhiro6.trial.mybatis.entity.GameRecord;
import com.github.mutsuhiro6.trial.mybatis.enumerate.GameResult;
import com.github.mutsuhiro6.trial.mybatis.mapper.GameRecordMapper;

@SpringBootApplication
public class TrialMybatisApplication implements ApplicationRunner {

  @Autowired
  GameRecordMapper gameRecordMapper;

  public static void main(String[] args) {
    SpringApplication.run(TrialMybatisApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    GameRecord gr = new GameRecord();
    gr.setGameDate(LocalDate.now());
    gr.setGameResult(GameResult.WIN);
    gr.setOpposingScore(0);
    gr.setScore(3);
    gr.setTeamName("Uppers");
    gr.setOpposingTeamName("Downers");
    System.out.println(gr);
    gameRecordMapper.insertGameRecord(gr);

    GameRecord found = gameRecordMapper.findByGameId(1).get();
    System.out.println(found);
  }

}
