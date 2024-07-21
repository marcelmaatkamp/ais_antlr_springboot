package com.mycompany.myapp.ais;

public class AISDataPojo {
  private String MMSI;
  private String BaseDateTime;
  private Double LAT;
  private Double LON;
  private Float SOG;
  private Float COG;
  private Float Heading;
  private String VesselName;
  private String IMO;
  private String CallSign;
  private Short VesselType;
  private Short Status;
  private Float Length;
  private Float Width;
  private Float Draft;
  private String Cargo;
  private String TransceiverClass;

  public AISDataPojo(String MMSI, String BaseDateTime, Double LAT, Double LON, Float SOG, Float COG,
                     Float Heading, String VesselName, String IMO, String CallSign, Short VesselType,
                     Short Status, Float Length, Float Width, Float Draft, String Cargo, String TransceiverClass) {
    this.MMSI = MMSI;
    this.BaseDateTime = BaseDateTime;
    this.LAT = LAT;
    this.LON = LON;
    this.SOG = SOG;
    this.COG = COG;
    this.Heading = Heading;
    this.VesselName = VesselName;
    this.IMO = IMO;
    this.CallSign = CallSign;
    this.VesselType = VesselType;
    this.Status = Status;
    this.Length = Length;
    this.Width = Width;
    this.Draft = Draft;
    this.Cargo = Cargo;
    this.TransceiverClass = TransceiverClass;
  }

  @Override
  public String toString() {
    return "AISDataPojo{" +
      "MMSI='" + MMSI + '\'' +
      ", BaseDateTime='" + BaseDateTime + '\'' +
      ", LAT=" + LAT +
      ", LON=" + LON +
      ", SOG=" + SOG +
      ", COG=" + COG +
      ", Heading=" + Heading +
      ", VesselName='" + VesselName + '\'' +
      ", IMO='" + IMO + '\'' +
      ", CallSign='" + CallSign + '\'' +
      ", VesselType=" + VesselType +
      ", Status=" + Status +
      ", Length=" + Length +
      ", Width=" + Width +
      ", Draft=" + Draft +
      ", Cargo='" + Cargo + '\'' +
      ", TransceiverClass='" + TransceiverClass + '\'' +
      '}';
  }
}
