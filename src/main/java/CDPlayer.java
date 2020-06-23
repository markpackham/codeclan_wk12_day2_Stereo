public class CDPlayer extends Component {

    private String cdName;

    public CDPlayer() {
        this.cdName = cdName;
    }
    public String playCD(){
        return "I am playing " + cdName;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

}
