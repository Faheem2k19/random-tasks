package dataclass;

import java.util.Date;

public class YouTubeCount{
  private String fname;
  private String lname;
  private String yChannelNameLabel;
  private Date channelDateLabel;
  private long subCountLabel;
  private String pathToChannelAvater;
  
  public YouTubeCount(String fname, String lname, String yChannelNameLabel, Date channelDateLabel, String pathToChannelAvater) {
    
    this.fname=fname;
    this.lname=lname;
    this.yChannelNameLabel=yChannelNameLabel;
    this.channelDateLabel=channelDateLabel;
    this.pathToChannelAvater=pathToChannelAvater;
    
  }

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getyChannelNameLabel() {
    return yChannelNameLabel;
  }

  public void setyChannelNameLabel(String yChannelNameLabel) {
    this.yChannelNameLabel = yChannelNameLabel;
  }

  public Date getChannelDateLabel() {
    return channelDateLabel;
  }

  public void setChannelDateLabel(Date channelDateLabel) {
    this.channelDateLabel = channelDateLabel;
  }

  public long getSubCountLabel() {
    return subCountLabel;
  }

  public void setSubCountLabel(long subCountLabel) {
    this.subCountLabel = subCountLabel;
  }

  public String getPathToChannelAvater() {
    return pathToChannelAvater;
  }

  public void setPathToChannelAvater(String pathToChannelAvater) {
    this.pathToChannelAvater = pathToChannelAvater;
  }
  
  @Override
  public String toString() {
   return (""+"ChannelName: "+ yChananelNameLable)
  }

}
