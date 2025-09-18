package io.appmetrica.analytics.reactnative;

import android.location.Location;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.profile.UserProfile;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class Utils {
    private static AdRevenue.Builder parseAdRevenuePrice(ReadableMap readableMap) {
        ReadableType type = readableMap.getType("price");
        String string = readableMap.getString("currency");
        return type == ReadableType.Number ? AdRevenue.newBuilder(readableMap.getDouble("price"), Currency.getInstance(string)) : AdRevenue.newBuilder(new BigDecimal(readableMap.getString("price")), Currency.getInstance(string));
    }

    public static AdRevenue toAdRevenue(ReadableMap readableMap) {
        String string;
        AdRevenue.Builder adRevenuePrice = parseAdRevenuePrice(readableMap);
        if (readableMap.hasKey("payload")) {
            adRevenuePrice.withPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        if (readableMap.hasKey("adType") && (string = readableMap.getString("adType")) != null) {
            adRevenuePrice.withAdType(toAdType(string));
        }
        if (readableMap.hasKey("adNetwork")) {
            adRevenuePrice.withAdNetwork(readableMap.getString("adNetwork"));
        }
        if (readableMap.hasKey("adPlacementID")) {
            adRevenuePrice.withAdPlacementId(readableMap.getString("adPlacementID"));
        }
        if (readableMap.hasKey("adPlacementName")) {
            adRevenuePrice.withAdPlacementName(readableMap.getString("adPlacementName"));
        }
        if (readableMap.hasKey("adUnitID")) {
            adRevenuePrice.withAdUnitId(readableMap.getString("adUnitID"));
        }
        if (readableMap.hasKey("adUnitName")) {
            adRevenuePrice.withAdUnitName(readableMap.getString("adUnitName"));
        }
        if (readableMap.hasKey("precision")) {
            adRevenuePrice.withPrecision(readableMap.getString("precision"));
        }
        return adRevenuePrice.build();
    }

    public static AdType toAdType(String str) {
        str.getClass();
        switch (str) {
            case "banner":
                return AdType.BANNER;
            case "native":
                return AdType.NATIVE;
            case "rewarded":
                return AdType.REWARDED;
            case "mrec":
                return AdType.MREC;
            case "interstitial":
                return AdType.INTERSTITIAL;
            default:
                return AdType.OTHER;
        }
    }

    public static AppMetricaConfig toAppMetricaConfig(ReadableMap readableMap) {
        ReadableMap map;
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(readableMap.getString("apiKey"));
        if (readableMap.hasKey(AttributionReporter.APP_VERSION)) {
            builderNewConfigBuilder.withAppVersion(readableMap.getString(AttributionReporter.APP_VERSION));
        }
        if (readableMap.hasKey("crashReporting")) {
            builderNewConfigBuilder.withCrashReporting(readableMap.getBoolean("crashReporting"));
        }
        if (readableMap.hasKey("firstActivationAsUpdate")) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(readableMap.getBoolean("firstActivationAsUpdate"));
        }
        if (readableMap.hasKey("location")) {
            builderNewConfigBuilder.withLocation(toLocation(readableMap.getMap("location")));
        }
        if (readableMap.hasKey("locationTracking")) {
            builderNewConfigBuilder.withLocationTracking(readableMap.getBoolean("locationTracking"));
        }
        if (readableMap.hasKey("logs") && readableMap.getBoolean("logs")) {
            builderNewConfigBuilder.withLogs();
        }
        if (readableMap.hasKey("maxReportsInDatabaseCount")) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(readableMap.getInt("maxReportsInDatabaseCount"));
        }
        if (readableMap.hasKey("nativeCrashReporting")) {
            builderNewConfigBuilder.withNativeCrashReporting(readableMap.getBoolean("nativeCrashReporting"));
        }
        if (readableMap.hasKey("preloadInfo")) {
            builderNewConfigBuilder.withPreloadInfo(toPreloadInfo(readableMap.getMap("preloadInfo")));
        }
        if (readableMap.hasKey("sessionTimeout")) {
            builderNewConfigBuilder.withSessionTimeout(readableMap.getInt("sessionTimeout"));
        }
        if (readableMap.hasKey("statisticsSending")) {
            builderNewConfigBuilder.withDataSendingEnabled(readableMap.getBoolean("statisticsSending"));
        }
        if (readableMap.hasKey("sessionsAutoTracking")) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(readableMap.getBoolean("sessionsAutoTracking"));
        }
        if (readableMap.hasKey("userProfileID")) {
            builderNewConfigBuilder.withUserProfileID(readableMap.getString("userProfileID"));
        }
        if (readableMap.hasKey("errorEnvironment") && (map = readableMap.getMap("errorEnvironment")) != null) {
            for (Map.Entry<String, Object> entry : map.toHashMap().entrySet()) {
                Object value = entry.getValue();
                builderNewConfigBuilder.withErrorEnvironmentValue(entry.getKey(), value == null ? null : value.toString());
            }
        }
        return builderNewConfigBuilder.build();
    }

    public static ECommerceCartItem toECommerceCartItem(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMap map = readableMap.getMap("product");
        Objects.requireNonNull(map);
        ECommerceProduct eCommerceProduct = toECommerceProduct(map);
        ReadableMap map2 = readableMap.getMap("price");
        Objects.requireNonNull(map2);
        ECommercePrice eCommercePrice = toECommercePrice(map2);
        if (eCommercePrice == null) {
            return null;
        }
        if (readableMap.getType("quantity") == ReadableType.Number) {
            ECommerceCartItem eCommerceCartItem = new ECommerceCartItem(eCommerceProduct, eCommercePrice, readableMap.getDouble("quantity"));
            if (readableMap.hasKey("referrer")) {
                eCommerceCartItem.setReferrer(toECommerceReferrer(readableMap.getMap("referrer")));
            }
            return eCommerceCartItem;
        }
        ECommerceCartItem eCommerceCartItem2 = new ECommerceCartItem(eCommerceProduct, eCommercePrice, new BigDecimal(readableMap.getString("quantity")));
        if (readableMap.hasKey("referrer")) {
            eCommerceCartItem2.setReferrer(toECommerceReferrer(readableMap.getMap("referrer")));
        }
        return eCommerceCartItem2;
    }

    public static ECommerceEvent toECommerceEvent(ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        ECommerceCartItem eCommerceCartItem;
        ECommerceCartItem eCommerceCartItem2;
        ReadableMap map3;
        String string = readableMap.getString("ecommerceEvent");
        if (string == null) {
            return null;
        }
        if (string.equals("showSceenEvent") && (map3 = readableMap.getMap("ecommerceScreen")) != null) {
            return ECommerceEvent.showScreenEvent(toECommerceScreen(map3));
        }
        if (string.equals("showProductCardEvent")) {
            ReadableMap map4 = readableMap.getMap("product");
            ReadableMap map5 = readableMap.getMap("ecommerceScreen");
            if (map4 != null && map5 != null) {
                return ECommerceEvent.showProductCardEvent(toECommerceProduct(map4), toECommerceScreen(map5));
            }
        }
        if (string.equals("showProductDetailsEvent")) {
            ReadableMap map6 = readableMap.getMap("product");
            ReadableMap map7 = readableMap.getMap("referrer");
            if (map6 != null) {
                return ECommerceEvent.showProductDetailsEvent(toECommerceProduct(map6), toECommerceReferrer(map7));
            }
        }
        if (string.equals("addCartItemEvent") && (eCommerceCartItem2 = toECommerceCartItem(readableMap.getMap("cartItem"))) != null) {
            return ECommerceEvent.addCartItemEvent(eCommerceCartItem2);
        }
        if (string.equals("removeCartItemEvent") && (eCommerceCartItem = toECommerceCartItem(readableMap.getMap("cartItem"))) != null) {
            return ECommerceEvent.removeCartItemEvent(eCommerceCartItem);
        }
        if (string.equals("beginCheckoutEvent") && (map2 = readableMap.getMap("order")) != null) {
            return ECommerceEvent.beginCheckoutEvent(toECommerceOrder(map2));
        }
        if (!string.equals("purchaseEvent") || (map = readableMap.getMap("order")) == null) {
            return null;
        }
        return ECommerceEvent.purchaseEvent(toECommerceOrder(map));
    }

    public static ECommerceOrder toECommerceOrder(ReadableMap readableMap) {
        String string = readableMap.getString("orderId");
        ReadableArray array = readableMap.getArray("products");
        Objects.requireNonNull(array);
        ArrayList arrayList = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            arrayList.add(toECommerceCartItem(array.getMap(i)));
        }
        Objects.requireNonNull(string);
        ECommerceOrder eCommerceOrder = new ECommerceOrder(string, arrayList);
        if (readableMap.hasKey("payload")) {
            eCommerceOrder.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        return eCommerceOrder;
    }

    public static ECommercePrice toECommercePrice(ReadableMap readableMap) {
        ReadableArray array;
        if (readableMap == null) {
            return null;
        }
        ReadableMap map = readableMap.getMap("amount");
        Objects.requireNonNull(map);
        ECommerceAmount ecommerceAmount = toEcommerceAmount(map);
        if (ecommerceAmount == null) {
            return null;
        }
        ECommercePrice eCommercePrice = new ECommercePrice(ecommerceAmount);
        if (readableMap.hasKey("internalComponents") && (array = readableMap.getArray("internalComponents")) != null) {
            ArrayList arrayList = new ArrayList(array.size());
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(toEcommerceAmount(array.getMap(i)));
            }
            eCommercePrice.setInternalComponents(arrayList);
        }
        return eCommercePrice;
    }

    public static ECommerceProduct toECommerceProduct(ReadableMap readableMap) {
        String string = readableMap.getString("sku");
        Objects.requireNonNull(string);
        ECommerceProduct eCommerceProduct = new ECommerceProduct(string);
        if (readableMap.hasKey("name")) {
            eCommerceProduct.setName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("actualPrice")) {
            eCommerceProduct.setActualPrice(toECommercePrice(readableMap.getMap("actualPrice")));
        }
        if (readableMap.hasKey("originalPrice")) {
            eCommerceProduct.setOriginalPrice(toECommercePrice(readableMap.getMap("originalPrice")));
        }
        if (readableMap.hasKey("promocodes")) {
            eCommerceProduct.setPromocodes(toListOfStrings(readableMap.getArray("promocodes")));
        }
        if (readableMap.hasKey("categoriesPath")) {
            eCommerceProduct.setCategoriesPath(toListOfStrings(readableMap.getArray("categoriesPath")));
        }
        if (readableMap.hasKey("payload")) {
            eCommerceProduct.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        return eCommerceProduct;
    }

    public static ECommerceReferrer toECommerceReferrer(ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap == null) {
            return null;
        }
        ECommerceReferrer eCommerceReferrer = new ECommerceReferrer();
        if (readableMap.hasKey("type")) {
            eCommerceReferrer.setType(readableMap.getString("type"));
        }
        if (readableMap.hasKey("identifier")) {
            eCommerceReferrer.setIdentifier(readableMap.getString("identifier"));
        }
        if (readableMap.hasKey("screen") && (map = readableMap.getMap("screen")) != null) {
            eCommerceReferrer.setScreen(toECommerceScreen(map));
        }
        return eCommerceReferrer;
    }

    public static ECommerceScreen toECommerceScreen(ReadableMap readableMap) {
        ECommerceScreen eCommerceScreen = new ECommerceScreen();
        if (readableMap.hasKey("name")) {
            eCommerceScreen.setName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("searchQuery")) {
            eCommerceScreen.setSearchQuery(readableMap.getString("searchQuery"));
        }
        if (readableMap.hasKey("payload")) {
            eCommerceScreen.setPayload(toMapOfStrings(readableMap.getMap("payload")));
        }
        if (readableMap.hasKey("categoriesPath")) {
            eCommerceScreen.setCategoriesPath(toListOfStrings(readableMap.getArray("categoriesPath")));
        }
        return eCommerceScreen;
    }

    public static ECommerceAmount toEcommerceAmount(ReadableMap readableMap) {
        ReadableType type = readableMap.getType("amount");
        String string = readableMap.getString("unit");
        if (string != null) {
            return type == ReadableType.Number ? new ECommerceAmount(readableMap.getDouble("amount"), string) : new ECommerceAmount(new BigDecimal(readableMap.getString("amount")), string);
        }
        return null;
    }

    private static List<String> toListOfStrings(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Objects.toString(it.next()));
        }
        return arrayList2;
    }

    public static Location toLocation(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Location location = new Location("Custom");
        if (readableMap.hasKey("latitude")) {
            location.setLatitude(readableMap.getDouble("latitude"));
        }
        if (readableMap.hasKey("longitude")) {
            location.setLongitude(readableMap.getDouble("longitude"));
        }
        if (readableMap.hasKey("altitude")) {
            location.setAltitude(readableMap.getDouble("altitude"));
        }
        if (readableMap.hasKey("accuracy")) {
            location.setAccuracy((float) readableMap.getDouble("accuracy"));
        }
        if (readableMap.hasKey("course")) {
            location.setBearing((float) readableMap.getDouble("course"));
        }
        if (readableMap.hasKey("speed")) {
            location.setSpeed((float) readableMap.getDouble("speed"));
        }
        if (readableMap.hasKey("timestamp")) {
            location.setTime((long) readableMap.getDouble("timestamp"));
        }
        return location;
    }

    private static Map<String, String> toMapOfStrings(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : readableMap.toHashMap().entrySet()) {
            if (entry.getValue() instanceof String) {
                map.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return map;
    }

    private static PreloadInfo toPreloadInfo(ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap == null) {
            return null;
        }
        PreloadInfo.Builder builderNewBuilder = PreloadInfo.newBuilder(readableMap.getString("trackingId"));
        if (readableMap.hasKey("additionalInfo") && (map = readableMap.getMap("additionalInfo")) != null) {
            for (Map.Entry<String, Object> entry : map.toHashMap().entrySet()) {
                Object value = entry.getValue();
                builderNewBuilder.setAdditionalParams(entry.getKey(), value == null ? null : value.toString());
            }
        }
        return builderNewBuilder.build();
    }

    public static Revenue.Receipt toReceipt(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Revenue.Receipt.Builder builderNewBuilder = Revenue.Receipt.newBuilder();
        if (readableMap.hasKey("receiptData")) {
            builderNewBuilder.withData(readableMap.getString("receiptData"));
        }
        if (readableMap.hasKey("signature")) {
            builderNewBuilder.withSignature(readableMap.getString("signature"));
        }
        return builderNewBuilder.build();
    }

    public static Revenue toRevenue(ReadableMap readableMap) {
        Revenue.Builder builderNewBuilder = Revenue.newBuilder((long) (readableMap.getDouble("price") * 1000000.0d), Currency.getInstance(readableMap.getString("currency")));
        if (readableMap.hasKey("productID")) {
            builderNewBuilder.withProductID(readableMap.getString("productID"));
        }
        if (readableMap.hasKey("payload")) {
            builderNewBuilder.withPayload(readableMap.getString("payload"));
        }
        if (readableMap.hasKey("quantity")) {
            builderNewBuilder.withQuantity(Integer.valueOf(readableMap.getInt("quantity")));
        }
        builderNewBuilder.withReceipt(toReceipt(readableMap.getMap("receipt")));
        return builderNewBuilder.build();
    }

    public static List<String> toStartupKeyList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string.equals("appmetrica_device_id_hash")) {
                arrayList.add("appmetrica_device_id_hash");
            }
            if (string.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                arrayList.add(StartupParamsCallback.APPMETRICA_DEVICE_ID);
            }
            if (string.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                arrayList.add(StartupParamsCallback.APPMETRICA_UUID);
            }
        }
        return arrayList;
    }

    public static UserProfile toUserProfile(ReadableMap readableMap) {
        return UserProfileSerializer.fromReadableMap(readableMap);
    }
}
