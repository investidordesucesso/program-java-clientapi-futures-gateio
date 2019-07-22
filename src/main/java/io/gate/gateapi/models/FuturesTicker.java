/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * OpenAPI spec version: 4.7.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FuturesTicker
 */

public class FuturesTicker {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private String last;

  public static final String SERIALIZED_NAME_CHANGE_PERCENTAGE = "change_percentage";
  @SerializedName(SERIALIZED_NAME_CHANGE_PERCENTAGE)
  private String changePercentage;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public static final String SERIALIZED_NAME_LOW24H = "low_24h";
  @SerializedName(SERIALIZED_NAME_LOW24H)
  private String low24h;

  public static final String SERIALIZED_NAME_HIGH24H = "high_24h";
  @SerializedName(SERIALIZED_NAME_HIGH24H)
  private String high24h;

  public static final String SERIALIZED_NAME_VOLUME24H = "volume_24h";
  @SerializedName(SERIALIZED_NAME_VOLUME24H)
  private String volume24h;

  public static final String SERIALIZED_NAME_VOLUME24H_BTC = "volume_24h_btc";
  @SerializedName(SERIALIZED_NAME_VOLUME24H_BTC)
  private String volume24hBtc;

  public static final String SERIALIZED_NAME_VOLUME24H_USD = "volume_24h_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME24H_USD)
  private String volume24hUsd;

  public static final String SERIALIZED_NAME_MARK_PRICE = "mark_price";
  @SerializedName(SERIALIZED_NAME_MARK_PRICE)
  private String markPrice;

  public static final String SERIALIZED_NAME_FUNDING_RATE = "funding_rate";
  @SerializedName(SERIALIZED_NAME_FUNDING_RATE)
  private String fundingRate;

  public static final String SERIALIZED_NAME_FUNDING_RATE_INDICATIVE = "funding_rate_indicative";
  @SerializedName(SERIALIZED_NAME_FUNDING_RATE_INDICATIVE)
  private String fundingRateIndicative;

  public static final String SERIALIZED_NAME_INDEX_PRICE = "index_price";
  @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
  private String indexPrice;

  public static final String SERIALIZED_NAME_QUANTO_BASE_RATE = "quanto_base_rate";
  @SerializedName(SERIALIZED_NAME_QUANTO_BASE_RATE)
  private String quantoBaseRate;

  public FuturesTicker contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Futures contract
   * @return contract
  **/
  @ApiModelProperty(value = "Futures contract")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public FuturesTicker last(String last) {
    this.last = last;
    return this;
  }

   /**
   * Last trading price
   * @return last
  **/
  @ApiModelProperty(value = "Last trading price")
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public FuturesTicker changePercentage(String changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

   /**
   * Change percentage.
   * @return changePercentage
  **/
  @ApiModelProperty(value = "Change percentage.")
  public String getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(String changePercentage) {
    this.changePercentage = changePercentage;
  }

  public FuturesTicker totalSize(String totalSize) {
    this.totalSize = totalSize;
    return this;
  }

   /**
   * Contract total size
   * @return totalSize
  **/
  @ApiModelProperty(value = "Contract total size")
  public String getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }

  public FuturesTicker low24h(String low24h) {
    this.low24h = low24h;
    return this;
  }

   /**
   * Lowest trading price in recent 24h
   * @return low24h
  **/
  @ApiModelProperty(value = "Lowest trading price in recent 24h")
  public String getLow24h() {
    return low24h;
  }

  public void setLow24h(String low24h) {
    this.low24h = low24h;
  }

  public FuturesTicker high24h(String high24h) {
    this.high24h = high24h;
    return this;
  }

   /**
   * Highest trading price in recent 24h
   * @return high24h
  **/
  @ApiModelProperty(value = "Highest trading price in recent 24h")
  public String getHigh24h() {
    return high24h;
  }

  public void setHigh24h(String high24h) {
    this.high24h = high24h;
  }

  public FuturesTicker volume24h(String volume24h) {
    this.volume24h = volume24h;
    return this;
  }

   /**
   * Trade size in recent 24h
   * @return volume24h
  **/
  @ApiModelProperty(value = "Trade size in recent 24h")
  public String getVolume24h() {
    return volume24h;
  }

  public void setVolume24h(String volume24h) {
    this.volume24h = volume24h;
  }

  public FuturesTicker volume24hBtc(String volume24hBtc) {
    this.volume24hBtc = volume24hBtc;
    return this;
  }

   /**
   * Trade volume in recent 24h in BTC
   * @return volume24hBtc
  **/
  @ApiModelProperty(value = "Trade volume in recent 24h in BTC")
  public String getVolume24hBtc() {
    return volume24hBtc;
  }

  public void setVolume24hBtc(String volume24hBtc) {
    this.volume24hBtc = volume24hBtc;
  }

  public FuturesTicker volume24hUsd(String volume24hUsd) {
    this.volume24hUsd = volume24hUsd;
    return this;
  }

   /**
   * Trade volume in recent 24h in USD
   * @return volume24hUsd
  **/
  @ApiModelProperty(value = "Trade volume in recent 24h in USD")
  public String getVolume24hUsd() {
    return volume24hUsd;
  }

  public void setVolume24hUsd(String volume24hUsd) {
    this.volume24hUsd = volume24hUsd;
  }

  public FuturesTicker markPrice(String markPrice) {
    this.markPrice = markPrice;
    return this;
  }

   /**
   * Recent mark price
   * @return markPrice
  **/
  @ApiModelProperty(value = "Recent mark price")
  public String getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(String markPrice) {
    this.markPrice = markPrice;
  }

  public FuturesTicker fundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Funding rate
   * @return fundingRate
  **/
  @ApiModelProperty(value = "Funding rate")
  public String getFundingRate() {
    return fundingRate;
  }

  public void setFundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
  }

  public FuturesTicker fundingRateIndicative(String fundingRateIndicative) {
    this.fundingRateIndicative = fundingRateIndicative;
    return this;
  }

   /**
   * Indicative Funding rate in next period
   * @return fundingRateIndicative
  **/
  @ApiModelProperty(value = "Indicative Funding rate in next period")
  public String getFundingRateIndicative() {
    return fundingRateIndicative;
  }

  public void setFundingRateIndicative(String fundingRateIndicative) {
    this.fundingRateIndicative = fundingRateIndicative;
  }

  public FuturesTicker indexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
    return this;
  }

   /**
   * Index price
   * @return indexPrice
  **/
  @ApiModelProperty(value = "Index price")
  public String getIndexPrice() {
    return indexPrice;
  }

  public void setIndexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
  }

  public FuturesTicker quantoBaseRate(String quantoBaseRate) {
    this.quantoBaseRate = quantoBaseRate;
    return this;
  }

   /**
   * Exchange rate of base currency and settlement currency in Quanto contract. Not existed in contract of other types
   * @return quantoBaseRate
  **/
  @ApiModelProperty(value = "Exchange rate of base currency and settlement currency in Quanto contract. Not existed in contract of other types")
  public String getQuantoBaseRate() {
    return quantoBaseRate;
  }

  public void setQuantoBaseRate(String quantoBaseRate) {
    this.quantoBaseRate = quantoBaseRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuturesTicker futuresTicker = (FuturesTicker) o;
    return Objects.equals(this.contract, futuresTicker.contract) &&
        Objects.equals(this.last, futuresTicker.last) &&
        Objects.equals(this.changePercentage, futuresTicker.changePercentage) &&
        Objects.equals(this.totalSize, futuresTicker.totalSize) &&
        Objects.equals(this.low24h, futuresTicker.low24h) &&
        Objects.equals(this.high24h, futuresTicker.high24h) &&
        Objects.equals(this.volume24h, futuresTicker.volume24h) &&
        Objects.equals(this.volume24hBtc, futuresTicker.volume24hBtc) &&
        Objects.equals(this.volume24hUsd, futuresTicker.volume24hUsd) &&
        Objects.equals(this.markPrice, futuresTicker.markPrice) &&
        Objects.equals(this.fundingRate, futuresTicker.fundingRate) &&
        Objects.equals(this.fundingRateIndicative, futuresTicker.fundingRateIndicative) &&
        Objects.equals(this.indexPrice, futuresTicker.indexPrice) &&
        Objects.equals(this.quantoBaseRate, futuresTicker.quantoBaseRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, last, changePercentage, totalSize, low24h, high24h, volume24h, volume24hBtc, volume24hUsd, markPrice, fundingRate, fundingRateIndicative, indexPrice, quantoBaseRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuturesTicker {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    low24h: ").append(toIndentedString(low24h)).append("\n");
    sb.append("    high24h: ").append(toIndentedString(high24h)).append("\n");
    sb.append("    volume24h: ").append(toIndentedString(volume24h)).append("\n");
    sb.append("    volume24hBtc: ").append(toIndentedString(volume24hBtc)).append("\n");
    sb.append("    volume24hUsd: ").append(toIndentedString(volume24hUsd)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    fundingRateIndicative: ").append(toIndentedString(fundingRateIndicative)).append("\n");
    sb.append("    indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
    sb.append("    quantoBaseRate: ").append(toIndentedString(quantoBaseRate)).append("\n");
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

