public class Stereo extends Component implements IPlayCD, IPlayRecord, IHeadPhone {

    private String stereoName;
    private String cdName;
    private String recordName;
    private String headPhone;

    public Stereo(String stereoName) {
        this.stereoName = stereoName;
        this.cdName = cdName;
        this.recordName = recordName;
        this.headPhone = headPhone;
    }

    public String getStereoName() {
        return stereoName;
    }

    public void setStereoName(String stereoName) {
        this.stereoName = stereoName;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String playCD() {
        return "I'm a Stereo playing "+cdName;
    }

    public String playRecord() {
        return "I'm a Stereo spinning "+recordName;
    }


    public String headPhone() {
        return headPhone;
    }

    public void setHeadPhone(String headPhone) {
        this.headPhone = headPhone;
    }

}
