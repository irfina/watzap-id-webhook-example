/*
 * WatzapEventDto.java
 *
 * Created on Jan 13, 2026, 13:48
 */
package net.irfin.demo_watzap_id.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Irfin Afifudin
 */
public class WatzapIncomingChatDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("data")
    private DataDto data;

    public WatzapIncomingChatDto() {}

    public WatzapIncomingChatDto(String type, DataDto data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataDto getData() {
        return data;
    }

    public void setData(DataDto data) {
        this.data = data;
    }

    public static class DataDto {

        @JsonProperty("chat_id")
        private String chatId;

        @JsonProperty("message_id")
        private String messageId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("profile_picture")
        private String profilePicture;

        @JsonProperty("timestamp")
        private Long timestamp;

        @JsonProperty("message_body")
        private String messageBody;

        @JsonProperty("message_ack")
        private String messageAck;

        @JsonProperty("has_media")
        private Boolean hasMedia;

        @JsonProperty("media_mime")
        private String mediaMime;

        @JsonProperty("media_name")
        private String mediaName;

        @JsonProperty("location_attached")
        private LocationDto locationAttached;

        @JsonProperty("is_forwading")
        private Boolean isForwading;

        @JsonProperty("is_from_me")
        private Boolean isFromMe;

        public DataDto() {}

        // Getters and setters

        public String getChatId() {
            return chatId;
        }

        public void setChatId(String chatId) {
            this.chatId = chatId;
        }

        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
        }

        public Long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        public String getMessageBody() {
            return messageBody;
        }

        public void setMessageBody(String messageBody) {
            this.messageBody = messageBody;
        }

        public String getMessageAck() {
            return messageAck;
        }

        public void setMessageAck(String messageAck) {
            this.messageAck = messageAck;
        }

        public Boolean getHasMedia() {
            return hasMedia;
        }

        public void setHasMedia(Boolean hasMedia) {
            this.hasMedia = hasMedia;
        }

        public String getMediaMime() {
            return mediaMime;
        }

        public void setMediaMime(String mediaMime) {
            this.mediaMime = mediaMime;
        }

        public String getMediaName() {
            return mediaName;
        }

        public void setMediaName(String mediaName) {
            this.mediaName = mediaName;
        }

        public LocationDto getLocationAttached() {
            return locationAttached;
        }

        public void setLocationAttached(LocationDto locationAttached) {
            this.locationAttached = locationAttached;
        }

        public Boolean getIsForwading() {
            return isForwading;
        }

        public void setIsForwading(Boolean isForwading) {
            this.isForwading = isForwading;
        }

        public Boolean getIsFromMe() {
            return isFromMe;
        }

        public void setIsFromMe(Boolean isFromMe) {
            this.isFromMe = isFromMe;
        }
    }

    public record LocationDto(
            @JsonProperty("latitude") Double latitude,
            @JsonProperty("longitude") Double longitude,
            @JsonProperty("name") String name,
            @JsonProperty("address") String address
    ) {

    }
}
