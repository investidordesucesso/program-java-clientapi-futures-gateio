/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Accounts available to transfer:  - &#x60;spot&#x60;: spot account - &#x60;margin&#x60;: margin account - &#x60;futures&#x60;: perpetual futures account - &#x60;delivery&#x60;: delivery futures account
 */

public class Transfer {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  /**
   * Account transferred from
   */
  @JsonAdapter(FromEnum.Adapter.class)
  public enum FromEnum {
    SPOT("spot"),
    
    MARGIN("margin"),
    
    FUTURES("futures"),
    
    DELIVERY("delivery");

    private String value;

    FromEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FromEnum fromValue(String text) {
      for (FromEnum b : FromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<FromEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FromEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FromEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FromEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private FromEnum from;

  /**
   * Account transferred to
   */
  @JsonAdapter(ToEnum.Adapter.class)
  public enum ToEnum {
    SPOT("spot"),
    
    MARGIN("margin"),
    
    FUTURES("futures"),
    
    DELIVERY("delivery");

    private String value;

    ToEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ToEnum fromValue(String text) {
      for (ToEnum b : ToEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ToEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ToEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ToEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ToEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private ToEnum to;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  public static final String SERIALIZED_NAME_SETTLE = "settle";
  @SerializedName(SERIALIZED_NAME_SETTLE)
  private String settle;

  public Transfer currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Transfer currency. For futures account, &#x60;currency&#x60; can be set to &#x60;POINT&#x60; or settle currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transfer from(FromEnum from) {
    this.from = from;
    return this;
  }

   /**
   * Account transferred from
   * @return from
  **/
  public FromEnum getFrom() {
    return from;
  }

  public void setFrom(FromEnum from) {
    this.from = from;
  }

  public Transfer to(ToEnum to) {
    this.to = to;
    return this;
  }

   /**
   * Account transferred to
   * @return to
  **/
  public ToEnum getTo() {
    return to;
  }

  public void setTo(ToEnum to) {
    this.to = to;
  }

  public Transfer amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transfer amount
   * @return amount
  **/
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transfer currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Margin currency pair. Required if transfer from or to margin account
   * @return currencyPair
  **/
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public Transfer settle(String settle) {
    this.settle = settle;
    return this;
  }

   /**
   * Futures settle currency. Required if &#x60;currency&#x60; is &#x60;POINT&#x60;
   * @return settle
  **/
  public String getSettle() {
    return settle;
  }

  public void setSettle(String settle) {
    this.settle = settle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.currency, transfer.currency) &&
        Objects.equals(this.from, transfer.from) &&
        Objects.equals(this.to, transfer.to) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.currencyPair, transfer.currencyPair) &&
        Objects.equals(this.settle, transfer.settle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, from, to, amount, currencyPair, settle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    settle: ").append(toIndentedString(settle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

