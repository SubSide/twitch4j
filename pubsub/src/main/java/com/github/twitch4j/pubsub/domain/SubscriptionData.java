package com.github.twitch4j.pubsub.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.twitch4j.common.enums.SubscriptionPlan;
import com.github.twitch4j.common.enums.SubscriptionType;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionData {

    /**
     * The login name for the user that purchased the subscription
     */
    private String userName;

    /**
     * The display name for the user that purchased the subscription
     */
    private String displayName;

    /**
     * The name of the channel where the subscription took place
     */
    private String channelName;

    /**
     * The id for the user that purchased the subscription
     */
    private String userId;

    /**
     * The id of the channel where the subscription took place
     */
    private String channelId;

    /**
     * RFC 3339 timestamp of when the subscription took place
     */
    private String time;

    /**
     * The type of subscription plan that was purchased
     */
    private SubscriptionPlan subPlan;

    /**
     * The name of the subscription plan that was purchased
     */
    private String subPlanName;

    /**
     * The number of months the receiving user been subscribed
     *
     * @see SubscriptionData#getCumulativeMonths()
     * @see SubscriptionData#getStreakMonths()
     */
    @Deprecated
    private Integer months;

    /**
     * How many months in total has the receiving user been subscribed
     */
    private Integer cumulativeMonths;

    /**
     * How many months in a row has the receiving user been subscribed
     */
    private Integer streakMonths;

    /**
     * The event type for this subscription
     */
    private SubscriptionType context;

    /**
     * The accompanying message when the subscription was shared
     */
    private CommerceMessage subMessage;

    private String recipientId;

    private String recipientUserName;

    private String recipientDisplayName;

    /**
     * The id of the user that received the subscription
     */
    public String getRecipientId() {
        return this.recipientId != null ? this.recipientId : this.userId;
    }

    /**
     * The login name of the user that received the subscription
     */
    public String getRecipientUserName() {
        return this.recipientUserName != null ? this.recipientUserName : this.userName;
    }

    /**
     * The display name of the user that received the subscription
     */
    public String getRecipientDisplayName() {
        return this.recipientDisplayName != null ? this.recipientDisplayName : this.displayName;
    }

}