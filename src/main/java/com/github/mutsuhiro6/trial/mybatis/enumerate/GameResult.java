package com.github.mutsuhiro6.trial.mybatis.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * Created on 2021/6/24.
 * 
 * @author Mutsuhiro Iwamoto <mutsuhiro6@icloud.com>
 */
@Getter
@AllArgsConstructor
public enum GameResult implements CodeValue {

  WIN("0", "WIN"),
  LOSE("1", "LOSE"),
  DRAW("2", "DRAW");

  private String code;
  private String label;
}
