/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * AutomationActionPO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationActionPO {
  public static final String SERIALIZED_NAME_ACTION_ID = "actionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId;

  public static final String SERIALIZED_NAME_ACTION_TYPE_ID = "actionTypeId";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE_ID)
  private String actionTypeId;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_PREV_ACTION_ID = "prevActionId";
  @SerializedName(SERIALIZED_NAME_PREV_ACTION_ID)
  private String prevActionId;

  public static final String SERIALIZED_NAME_ROBOT_ID = "robotId";
  @SerializedName(SERIALIZED_NAME_ROBOT_ID)
  private String robotId;

  public AutomationActionPO() {
  }

  public AutomationActionPO actionId(String actionId) {
    
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @javax.annotation.Nonnull
  public String getActionId() {
    return actionId;
  }


  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  public AutomationActionPO actionTypeId(String actionTypeId) {
    
    this.actionTypeId = actionTypeId;
    return this;
  }

   /**
   * Get actionTypeId
   * @return actionTypeId
  **/
  @javax.annotation.Nonnull
  public String getActionTypeId() {
    return actionTypeId;
  }


  public void setActionTypeId(String actionTypeId) {
    this.actionTypeId = actionTypeId;
  }


  public AutomationActionPO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public AutomationActionPO prevActionId(String prevActionId) {
    
    this.prevActionId = prevActionId;
    return this;
  }

   /**
   * Get prevActionId
   * @return prevActionId
  **/
  @javax.annotation.Nullable
  public String getPrevActionId() {
    return prevActionId;
  }


  public void setPrevActionId(String prevActionId) {
    this.prevActionId = prevActionId;
  }


  public AutomationActionPO robotId(String robotId) {
    
    this.robotId = robotId;
    return this;
  }

   /**
   * Get robotId
   * @return robotId
  **/
  @javax.annotation.Nonnull
  public String getRobotId() {
    return robotId;
  }


  public void setRobotId(String robotId) {
    this.robotId = robotId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationActionPO automationActionPO = (AutomationActionPO) o;
    return Objects.equals(this.actionId, automationActionPO.actionId) &&
        Objects.equals(this.actionTypeId, automationActionPO.actionTypeId) &&
        Objects.equals(this.input, automationActionPO.input) &&
        Objects.equals(this.prevActionId, automationActionPO.prevActionId) &&
        Objects.equals(this.robotId, automationActionPO.robotId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionTypeId, input, prevActionId, robotId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationActionPO {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionTypeId: ").append(toIndentedString(actionTypeId)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    prevActionId: ").append(toIndentedString(prevActionId)).append("\n");
    sb.append("    robotId: ").append(toIndentedString(robotId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("actionId");
    openapiFields.add("actionTypeId");
    openapiFields.add("input");
    openapiFields.add("prevActionId");
    openapiFields.add("robotId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("actionId");
    openapiRequiredFields.add("actionTypeId");
    openapiRequiredFields.add("robotId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutomationActionPO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutomationActionPO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationActionPO is not found in the empty JSON string", AutomationActionPO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutomationActionPO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutomationActionPO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutomationActionPO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("actionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionId").toString()));
      }
      if (!jsonObj.get("actionTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionTypeId").toString()));
      }
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if ((jsonObj.get("prevActionId") != null && !jsonObj.get("prevActionId").isJsonNull()) && !jsonObj.get("prevActionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prevActionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prevActionId").toString()));
      }
      if (!jsonObj.get("robotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `robotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("robotId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationActionPO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationActionPO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationActionPO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationActionPO.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationActionPO>() {
           @Override
           public void write(JsonWriter out, AutomationActionPO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutomationActionPO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutomationActionPO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationActionPO
  * @throws IOException if the JSON string is invalid with respect to AutomationActionPO
  */
  public static AutomationActionPO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationActionPO.class);
  }

 /**
  * Convert an instance of AutomationActionPO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

