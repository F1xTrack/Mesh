package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Objects;

/* renamed from: kL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9998kL1 {

    /* renamed from: a */
    public static final String[] f36435a = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", RemoteMessageConst.MSGTYPE, "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_buyer_stage", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: b */
    public static final String[] f36436b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_cbs", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: c */
    public static final String[] f36437c = {"items"};

    /* renamed from: d */
    public static final String[] f36438d = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_cbs", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", CommonCode.MapKey.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: a */
    public static int m22191a(Context context, String str) {
        int iM5271c;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strM5272d = AbstractC0763M7.m5272d(str);
        if (strM5272d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerM5546c = AbstractC0826N7.m5546c(context);
                iM5271c = AbstractC0826N7.m5544a(appOpsManagerM5546c, strM5272d, Binder.getCallingUid(), packageName);
                if (iM5271c == 0) {
                    iM5271c = AbstractC0826N7.m5544a(appOpsManagerM5546c, strM5272d, iMyUid, AbstractC0826N7.m5545b(context));
                }
            } else {
                iM5271c = AbstractC0763M7.m5271c((AppOpsManager) AbstractC0763M7.m5269a(context, AppOpsManager.class), strM5272d, packageName);
            }
            if (iM5271c != 0) {
                return -2;
            }
        }
        return 0;
    }
}
