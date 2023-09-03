/*
 * simple_clients_demo API
 * simple_clients_demo API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * ContactDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T23:32:56.133581800+05:00[Asia/Yekaterinburg]")
public class ContactDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  /**
   * Gets or Sets contactType
   */
  @JsonAdapter(ContactTypeEnum.Adapter.class)
  public enum ContactTypeEnum {
    EMAIL("EMAIL"),
    
    PHONE("PHONE");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContactTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContactTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContactTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContactTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contactType";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  private ContactTypeEnum contactType;


  public ContactDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ContactDto contact(String contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContact() {
    return contact;
  }


  public void setContact(String contact) {
    this.contact = contact;
  }


  public ContactDto contactType(ContactTypeEnum contactType) {
    
    this.contactType = contactType;
    return this;
  }

   /**
   * Get contactType
   * @return contactType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactTypeEnum getContactType() {
    return contactType;
  }


  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDto contactDto = (ContactDto) o;
    return Objects.equals(this.id, contactDto.id) &&
        Objects.equals(this.contact, contactDto.contact) &&
        Objects.equals(this.contactType, contactDto.contactType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contact, contactType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
