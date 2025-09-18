package io.appmetrica.analytics.reactnative;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;

/* loaded from: classes2.dex */
final class UserProfileSerializer {
    private UserProfileSerializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserProfile fromReadableMap(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("attributes");
        if (array == null) {
            throw new IllegalArgumentException();
        }
        UserProfile.Builder builderNewBuilder = UserProfile.newBuilder();
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            if (map != null) {
                builderNewBuilder.apply(parseUserProfileUpdate(map));
            }
        }
        return builderNewBuilder.build();
    }

    private static GenderAttribute.Gender getGender(String str) {
        str.getClass();
        return !str.equals("female") ? !str.equals("male") ? GenderAttribute.Gender.OTHER : GenderAttribute.Gender.MALE : GenderAttribute.Gender.FEMALE;
    }

    private static UserProfileUpdate<?> parseBirthDate(String str, ReadableMap readableMap) {
        BirthDateAttribute birthDateAttributeBirthDate;
        birthDateAttributeBirthDate = Attribute.birthDate();
        str.getClass();
        switch (str) {
            case "BirthDateWithAge":
                int i = readableMap.getInt("age");
                return readableMap.getBoolean("ifUndefined") ? birthDateAttributeBirthDate.withAgeIfUndefined(i) : birthDateAttributeBirthDate.withAge(i);
            case "BirthDateWithDay":
                int i2 = readableMap.getInt("year");
                int i3 = readableMap.getInt("month");
                int i4 = readableMap.getInt(LocalNotification.Repeat.Type.DAY);
                return readableMap.getBoolean("ifUndefined") ? birthDateAttributeBirthDate.withBirthDateIfUndefined(i2, i3, i4) : birthDateAttributeBirthDate.withBirthDate(i2, i3, i4);
            case "BirthDateValueReset":
                return birthDateAttributeBirthDate.withValueReset();
            case "BirthDateWithYear":
                int i5 = readableMap.getInt("year");
                return readableMap.getBoolean("ifUndefined") ? birthDateAttributeBirthDate.withBirthDateIfUndefined(i5) : birthDateAttributeBirthDate.withBirthDate(i5);
            case "BirthDateWithMonth":
                int i6 = readableMap.getInt("year");
                int i7 = readableMap.getInt("month");
                return readableMap.getBoolean("ifUndefined") ? birthDateAttributeBirthDate.withBirthDateIfUndefined(i6, i7) : birthDateAttributeBirthDate.withBirthDate(i6, i7);
            default:
                throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
    }

    private static UserProfileUpdate<?> parseBoolean(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        BooleanAttribute booleanAttributeCustomBoolean = Attribute.customBoolean(string);
        str.getClass();
        if (str.equals("BooleanValueReset")) {
            return booleanAttributeCustomBoolean.withValueReset();
        }
        if (!str.equals("BooleanValue")) {
            throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
        boolean z = readableMap.getBoolean("value");
        return readableMap.getBoolean("ifUndefined") ? booleanAttributeCustomBoolean.withValueIfUndefined(z) : booleanAttributeCustomBoolean.withValue(z);
    }

    private static UserProfileUpdate<?> parseCounter(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        CounterAttribute counterAttributeCustomCounter = Attribute.customCounter(string);
        if (str.equals("Counter")) {
            return counterAttributeCustomCounter.withDelta(readableMap.getDouble("delta"));
        }
        throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
    }

    private static UserProfileUpdate<?> parseGender(String str, ReadableMap readableMap) {
        GenderAttribute genderAttributeGender = Attribute.gender();
        str.getClass();
        if (str.equals("GenderValueReset")) {
            return genderAttributeGender.withValueReset();
        }
        if (!str.equals("GenderValue")) {
            throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
        String string = readableMap.getString("value");
        if (string == null) {
            throw new IllegalArgumentException("Value should not be null");
        }
        GenderAttribute.Gender gender = getGender(string);
        return readableMap.getBoolean("ifUndefined") ? genderAttributeGender.withValueIfUndefined(gender) : genderAttributeGender.withValue(gender);
    }

    private static UserProfileUpdate<?> parseName(String str, ReadableMap readableMap) {
        NameAttribute nameAttributeName = Attribute.name();
        str.getClass();
        if (!str.equals("NameValue")) {
            if (str.equals("NameValueReset")) {
                return nameAttributeName.withValueReset();
            }
            throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
        String string = readableMap.getString("value");
        if (string != null) {
            return readableMap.getBoolean("ifUndefined") ? nameAttributeName.withValueIfUndefined(string) : nameAttributeName.withValue(string);
        }
        throw new IllegalArgumentException("Value should not be null");
    }

    private static UserProfileUpdate<?> parseNotificationsEnabled(String str, ReadableMap readableMap) {
        NotificationsEnabledAttribute notificationsEnabledAttributeNotificationsEnabled = Attribute.notificationsEnabled();
        str.getClass();
        if (str.equals("NotificationsEnabledValue")) {
            boolean z = readableMap.getBoolean("value");
            return readableMap.getBoolean("ifUndefined") ? notificationsEnabledAttributeNotificationsEnabled.withValueIfUndefined(z) : notificationsEnabledAttributeNotificationsEnabled.withValue(z);
        }
        if (str.equals("NotificationsEnabledValueReset")) {
            return notificationsEnabledAttributeNotificationsEnabled.withValueReset();
        }
        throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
    }

    private static UserProfileUpdate<?> parseNumber(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        NumberAttribute numberAttributeCustomNumber = Attribute.customNumber(string);
        str.getClass();
        if (str.equals("NumberValueReset")) {
            return numberAttributeCustomNumber.withValueReset();
        }
        if (!str.equals("NumberValue")) {
            throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
        double d = readableMap.getDouble("value");
        return readableMap.getBoolean("ifUndefined") ? numberAttributeCustomNumber.withValueIfUndefined(d) : numberAttributeCustomNumber.withValue(d);
    }

    private static UserProfileUpdate<?> parseString(String str, ReadableMap readableMap) {
        String string = readableMap.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Key should not be null");
        }
        StringAttribute stringAttributeCustomString = Attribute.customString(string);
        str.getClass();
        if (!str.equals("StringValue")) {
            if (str.equals("StringValueReset")) {
                return stringAttributeCustomString.withValueReset();
            }
            throw new IllegalArgumentException("Unknown UserProfile type ".concat(str));
        }
        String string2 = readableMap.getString("value");
        if (string2 != null) {
            return readableMap.getBoolean("ifUndefined") ? stringAttributeCustomString.withValueIfUndefined(string2) : stringAttributeCustomString.withValue(string2);
        }
        throw new IllegalArgumentException("Value should not be null");
    }

    private static UserProfileUpdate<?> parseUserProfileUpdate(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if (string == null) {
            throw new IllegalArgumentException("Type should not be null");
        }
        if (string.startsWith("BirthDate")) {
            return parseBirthDate(string, readableMap);
        }
        if (string.startsWith("Boolean")) {
            return parseBoolean(string, readableMap);
        }
        if (string.startsWith("Counter")) {
            return parseCounter(string, readableMap);
        }
        if (string.startsWith("Gender")) {
            return parseGender(string, readableMap);
        }
        if (string.startsWith("Name")) {
            return parseName(string, readableMap);
        }
        if (string.startsWith("NotificationsEnabled")) {
            return parseNotificationsEnabled(string, readableMap);
        }
        if (string.startsWith("Number")) {
            return parseNumber(string, readableMap);
        }
        if (string.startsWith("String")) {
            return parseString(string, readableMap);
        }
        throw new IllegalArgumentException("Unknown UserProfile type ".concat(string));
    }
}
