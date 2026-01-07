package net.runelite.client.plugins.microbot.gotr.data;


import lombok.Getter;
import net.runelite.api.QuestState;

public class GuardianPortalInfo {
    @Getter
    private String name;
    @Getter
    private int requiredLevel;
    private int runeId;
    private int talismanId;
    @Getter
    private int spriteId;
    @Getter
    private RuneType runeType;
    @Getter
    private CellType cellType;

    @Getter
    private QuestState questState;

    public GuardianPortalInfo(String name, int requiredLevel, int runeId, int talismanId, int spriteId, RuneType runeType, CellType cellType, QuestState questState) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.runeId = runeId;
        this.talismanId = talismanId;
        this.spriteId = spriteId;
        this.runeType = runeType;
        this.cellType = cellType;
        this.questState = questState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public int getRuneId() {
        return runeId;
    }

    public void setRuneId(int runeId) {
        this.runeId = runeId;
    }

    public int getTalismanId() {
        return talismanId;
    }

    public void setTalismanId(int talismanId) {
        this.talismanId = talismanId;
    }

    public int getSpriteId() {
        return spriteId;
    }

    public void setSpriteId(int spriteId) {
        this.spriteId = spriteId;
    }

    public RuneType getRuneType() {
        return runeType;
    }

    public void setRuneType(RuneType runeType) {
        this.runeType = runeType;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public QuestState getQuestState() {
        return questState;
    }

    public void setQuestState(QuestState questState) {
        this.questState = questState;
    }
}