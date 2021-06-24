package com.github.mutsuhiro6.trial.mybatis.mapper;

import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import com.github.mutsuhiro6.trial.mybatis.entity.GameRecord;

/**
 * 
 * Created on 2021/6/24.
 * 
 * @author Mutsuhiro Iwamoto <mutsuhiro6@icloud.com>
 */
@Mapper
public interface GameRecordMapper {

  void insertGameRecord(GameRecord gameRecord);

  Optional<GameRecord> findByGameId(long game_id);
}
