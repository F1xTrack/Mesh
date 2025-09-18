package p000;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: pL1 */
/* loaded from: classes.dex */
public abstract class AbstractC10638pL1 {

    /* renamed from: a */
    public static final String[] f40027a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* renamed from: b */
    public static final String[] f40028b = {"ad_impression"};

    /* renamed from: c */
    public static final String[] f40029c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* renamed from: d */
    public static final String[] f40030d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: a */
    public static final void m23741a(S91 s91, PictureInPictureParams.Builder builder, boolean z) {
        O90.m5968f(s91, "context");
        if (builder == null || Build.VERSION.SDK_INT < 31) {
            return;
        }
        builder.setAutoEnterEnabled(z);
        PictureInPictureParams pictureInPictureParamsBuild = builder.build();
        O90.m5967e(pictureInPictureParamsBuild, "build(...)");
        m23744d(s91, pictureInPictureParamsBuild);
    }

    /* renamed from: b */
    public static final ArrayList m23742b(S91 s91, boolean z, C1142S9 c1142s9) {
        O90.m5968f(s91, "context");
        O90.m5968f(c1142s9, "receiver");
        int i = z ? 1 : 2;
        Intent intentPutExtra = new Intent("rnv_media_control").putExtra("rnv_control_type", z ? 1 : 2);
        O90.m5967e(intentPutExtra, "putExtra(...)");
        S91 s912 = (S91) c1142s9.f10601c;
        intentPutExtra.setPackage(s912.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(s912, i, intentPutExtra, 201326592);
        O90.m5967e(broadcast, "getBroadcast(...)");
        Icon iconCreateWithResource = Icon.createWithResource(s91, z ? R.drawable.exo_icon_play : R.drawable.exo_icon_pause);
        O90.m5967e(iconCreateWithResource, "createWithResource(...)");
        String str = z ? "play" : "pause";
        M10.m5201p();
        return new ArrayList(new C6407m8(new RemoteAction[]{M10.m5190e(iconCreateWithResource, str, str, broadcast)}, true));
    }

    /* renamed from: c */
    public static boolean m23743c(S91 s91) throws PackageManager.NameNotFoundException {
        Activity currentActivity;
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        AbstractActivityC0499Hv abstractActivityC0499HvM23985a = AbstractC10766qL1.m23985a(s91);
        ActivityInfo activityInfo = abstractActivityC0499HvM23985a.getPackageManager().getActivityInfo(abstractActivityC0499HvM23985a.getComponentName(), 128);
        O90.m5967e(activityInfo, "getActivityInfo(...)");
        boolean z = (activityInfo.flags & 4194304) != 0;
        boolean zHasSystemFeature = abstractActivityC0499HvM23985a.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
        if (!z || !zHasSystemFeature || (currentActivity = s91.f10602a.getCurrentActivity()) == null) {
            return false;
        }
        if (i >= 26) {
            if (((AppOpsManager) currentActivity.getSystemService("appops")).noteOpNoThrow("android:picture_in_picture", Process.myUid(), currentActivity.getPackageName()) != 0) {
                return false;
            }
        } else if (i >= 26 || i < 24) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m23744d(S91 s91, PictureInPictureParams pictureInPictureParams) {
        if (Build.VERSION.SDK_INT < 26 || !m23743c(s91)) {
            return;
        }
        try {
            AbstractC10766qL1.m23985a(s91).setPictureInPictureParams(pictureInPictureParams);
        } catch (IllegalStateException e) {
            AbstractC10922rZ1.m24429c("PictureInPictureUtil", e.toString());
        }
    }
}
