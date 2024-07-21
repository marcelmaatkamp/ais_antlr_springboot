package com.mycompany.myapp.shared.collection.domain;

public class Vessel {
  private String MMSI;
  private String BaseDateTime;
  private double LAT;
  private double LON;
  private float SOG;
  private float COG;
  private float Heading;
  private String VesselName;
  private String IMO;
  private String CallSign;
  private short VesselType;
  private short Status;
  private float Length;
  private float Width;
  private float Draft;
  private String Cargo;
  private String TransceiverClass;

  public Vessel(String MMSI, String BaseDateTime, double LAT, double LON, float SOG, float COG,
                     float Heading, String VesselName, String IMO, String CallSign, short VesselType,
                     short Status, float Length, float Width, float Draft, String Cargo, String TransceiverClass) {
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

