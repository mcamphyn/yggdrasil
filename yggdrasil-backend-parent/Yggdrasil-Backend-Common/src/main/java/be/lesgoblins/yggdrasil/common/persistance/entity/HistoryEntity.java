package be.lesgoblins.yggdrasil.common.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@MappedSuperclass
public class HistoryEntity {

    @Column(name="HISTORY_CREATION")
    private Time creation;
    @Column(name="HISTORY_LAST_UPDATE")
    private Time lastUpdate;
}
