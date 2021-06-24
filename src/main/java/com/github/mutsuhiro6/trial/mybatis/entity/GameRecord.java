package com.github.mutsuhiro6.trial.mybatis.entity;

import java.time.LocalDate;
import com.github.mutsuhiro6.trial.mybatis.enumerate.GameResult;
import lombok.Data;

/**
 * 
 * Created on 2021/6/24.
 * 
 * @author Mutsuhiro Iwamoto <mutsuhiro6@icloud.com>
 */
@Data
public class GameRecord {
  private long gameId;
  private LocalDate gameDate;
  private String teamName;
  private String opposingTeamName;
  private GameResult gameResult;
  private int score;
  private int opposingScore;
}
