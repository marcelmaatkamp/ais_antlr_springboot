package com.mycompany.myapp.ais;

import com.mycompany.myapp.ais.parser.AISDataBaseListener;

import java.util.ArrayList;
import java.util.List;

public class AISDataBasePojoListener extends AISDataBaseListener {
  private final List<AISDataPojo> aisDataPojos = new ArrayList<>();

  public List<AISDataPojo> getAisDataPojos() {
    return aisDataPojos;
  }

  @Override
  public void exitRow(com.mycompany.myapp.ais.parser.AISDataParser.RowContext ctx) {
    AISDataPojo pojo = new AISDataPojo(
      ctx.mmsi().getText(),
      ctx.dateTime().getText(),
      Double.parseDouble(ctx.lat().getText()),
      Double.parseDouble(ctx.lon().getText()),
      Float.parseFloat(ctx.sog().getText()),
      Float.parseFloat(ctx.cog().getText()),
      Float.parseFloat(ctx.heading().getText()),
      ctx.vesselName().getText(),
      (ctx.imo() != null && !ctx.imo().isEmpty()? ctx.imo().getText(): null),
      (ctx.callSign() != null && !ctx.callSign().isEmpty() ? ctx.callSign().getText(): null),
      (ctx.vesselType() != null && !ctx.vesselType().isEmpty() ? Short.parseShort(ctx.vesselType().getText()): null),
      (ctx.status() != null && !ctx.status().getText().isEmpty() ? Short.parseShort(ctx.status().getText()): null),
      (ctx.length() != null && !ctx.length().isEmpty() ? Short.parseShort(ctx.length().getText()): null),
      (ctx.width() != null && !ctx.width().isEmpty() ? Short.parseShort(ctx.width().getText()): null),
      (ctx.draft() != null && !ctx.draft().isEmpty() ? Float.parseFloat(ctx.draft().getText()): null),
      (ctx.cargo() != null && !ctx.cargo().isEmpty() ? ctx.cargo().getText(): null),
      (ctx.transceiverClass() != null && !ctx.transceiverClass().isEmpty() ? ctx.transceiverClass().getText():null)
    );
    aisDataPojos.add(pojo);
  }
}
