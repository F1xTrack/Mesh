package io.appmetrica.analytics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Map;
import p000.AbstractC1374Vq;

/* loaded from: classes2.dex */
public interface StartupParamsCallback {
    public static final String APPMETRICA_DEVICE_ID = "appmetrica_device_id";
    public static final String APPMETRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String APPMETRICA_UUID = "appmetrica_uuid";

    public static final class Reason {
        public final String value;
        public static Reason UNKNOWN = new Reason(GrsBaseInfo.CountryCodeSource.UNKNOWN);
        public static Reason NETWORK = new Reason("NETWORK");
        public static Reason INVALID_RESPONSE = new Reason("INVALID_RESPONSE");

        public Reason(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Reason.class != obj.getClass()) {
                return false;
            }
            return this.value.equals(((Reason) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC1374Vq.m8593l(new StringBuilder("Reason{value='"), this.value, "'}");
        }
    }

    public static final class Result {
        public final Map<String, StartupParamsItem> parameters;
        public final String uuid = parameterForKey(StartupParamsCallback.APPMETRICA_UUID);
        public final String deviceId = parameterForKey(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        public final String deviceIdHash = parameterForKey("appmetrica_device_id_hash");

        public Result(Map<String, StartupParamsItem> map) {
            this.parameters = map;
        }

        public String parameterForKey(String str) {
            StartupParamsItem startupParamsItem = this.parameters.get(str);
            if (startupParamsItem != null) {
                return startupParamsItem.getId();
            }
            return null;
        }
    }

    void onReceive(Result result);

    void onRequestError(Reason reason, Result result);
}
