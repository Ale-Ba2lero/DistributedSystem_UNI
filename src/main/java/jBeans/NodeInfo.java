package jBeans;

public class NodeInfo  implements Comparable< NodeInfo > {
    private int id;
    private String ip;
    private int port;

    public NodeInfo(int id, String ip, int port) {
        this.id = id;
        this.ip = ip;
        this.port = port;
    }

    public NodeInfo(){}

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }


    @Override
    public String toString() {
        return "NodeInfo{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }

    @Override
    public int compareTo(NodeInfo o) {
        return this.getId() - o.getId();
    }
}