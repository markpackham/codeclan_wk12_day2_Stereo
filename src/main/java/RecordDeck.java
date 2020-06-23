public class RecordDeck extends Component implements IPlayRecord{
    private String recordName;

    public RecordDeck() {
        this.recordName = recordName;
    }

    public String playRecord(){
        return "I am spinning " + recordName;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

}
