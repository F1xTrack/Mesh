package com.huawei.hms.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p004ui.UpdateAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.ConnectionErrorMessages;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.update.note.DoNothingResolution;
import com.huawei.hms.update.note.NotInstalledHmsResolution;
import com.huawei.hms.update.p017ui.UpdateBean;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import p000.AbstractC0852NX;
import p000.AbstractC7222ym;
import p000.C8499Wu1;
import p000.T81;

/* loaded from: classes.dex */
final class HuaweiApiAvailabilityImpl extends HuaweiApiAvailability {

    /* renamed from: a */
    private static final HuaweiApiAvailabilityImpl f18790a = new HuaweiApiAvailabilityImpl();

    /* renamed from: com.huawei.hms.api.HuaweiApiAvailabilityImpl$a */
    public class C2034a implements BusResponseCallback {

        /* renamed from: a */
        final /* synthetic */ T81[] f18791a;

        public C2034a(T81[] t81Arr) {
            this.f18791a = t81Arr;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult innerError(Activity activity, int i, String str) {
            HMSLog.m12620e("HuaweiApiAvailabilityImpl", "Test foreground bus error: resultCode " + i + ", errMessage" + str);
            this.f18791a[0].m7576a(new AvailabilityException());
            return null;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult succeedReturn(Activity activity, int i, Intent intent) {
            HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Test foreground bus success: resultCode " + i + ", data" + intent);
            return null;
        }
    }

    private HuaweiApiAvailabilityImpl() {
    }

    /* renamed from: a */
    private static Intent m11492a(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    public static HuaweiApiAvailabilityImpl getInstance() {
        return f18790a;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr) {
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        if (huaweiApi != null) {
            try {
                m11496a(huaweiApi);
            } catch (AvailabilityException e) {
                HMSLog.m12622i("HuaweiApiAvailabilityImpl", "checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi<?> huaweiApi2 : huaweiApiArr) {
                m11496a(huaweiApi2);
            }
        }
        return c8499Wu1;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return getResolveErrorPendingIntent(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return getErrorDialog(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public String getErrorString(int i) {
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Enter getErrorString, errorCode: " + i);
        return ConnectionResult.getErrorString(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        T81[] t81Arr = {new T81()};
        C8499Wu1 c8499Wu1 = t81Arr[0].f11181a;
        int iIsHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, iIsHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(ResolutionDelegate.CALLBACK_METHOD, new C2034a(t81Arr));
            Bundle bundle = new Bundle();
            bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
        } else if (iIsHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
        } else if (iIsHuaweiMobileServicesAvailable == 0) {
            HMSLog.m12622i("HuaweiApiAvailabilityImpl", "The HMS service is available.");
        } else {
            HMSLog.m12620e("HuaweiApiAvailabilityImpl", "Framework can not solve the availability problem.");
            t81Arr[0].m7576a(new AvailabilityException());
        }
        return c8499Wu1;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Intent getResolveErrorIntent(Activity activity, int i) {
        AbstractC7222ym.m26244u(i, "Enter getResolveErrorIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (activity == null) {
            return null;
        }
        if (i == 1 || i == 2) {
            return (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) ? (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "getStartUpdateIntent", new Object[]{activity, m11494a(activity.getApplicationContext())}) : m11492a(activity, NotInstalledHmsResolution.class.getName());
        }
        if (i == 6) {
            return m11492a(activity, BindingFailedResolution.class.getName());
        }
        if (i == 9 && Util.isAvailableLibExist(activity)) {
            return m11492a(activity, AppSpoofResolution.class.getName());
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getResolveErrorPendingIntent(Activity activity, int i) {
        AbstractC7222ym.m26244u(i, "Enter getResolveErrorPendingIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, 67108864);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String hMSPackageNameForMultiService = HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService();
        if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
            HMSLog.m12623w("HuaweiApiAvailabilityImpl", "hmsPackageName is empty, Service is invalid.");
            return 1;
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(hMSPackageNameForMultiService))) {
            return HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000) ? 2 : 0;
        }
        HMSLog.m12623w("HuaweiApiAvailabilityImpl", "hmsPackageName is not installed, Service is invalid.");
        return 1;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i, PendingIntent pendingIntent) {
        if (i == 0) {
            return false;
        }
        return pendingIntent != null || i == 1 || i == 2 || i == 6 || i == 9;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2) throws IntentSender.SendIntentException {
        resolveError(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void showErrorNotification(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Enter showErrorNotification, errorCode: " + i);
        if (!(context instanceof Activity)) {
            HMSLog.m12622i("HuaweiApiAvailabilityImpl", "context not instanceof Activity");
            return;
        }
        Dialog errorDialog = getErrorDialog((Activity) context, i, 0);
        if (errorDialog == null) {
            HMSLog.m12622i("HuaweiApiAvailabilityImpl", "showErrorNotification errorDialog can not be null");
        } else {
            errorDialog.show();
        }
    }

    /* renamed from: a */
    private static Intent m11493a(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i) {
        return isUserResolvableError(i, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent) throws IntentSender.SendIntentException {
        Checker.checkNonNull(activity, "activity must not be null.");
        if (pendingIntent != null) {
            AbstractC7222ym.m26244u(i, "Enter resolveError, param pendingIntent is not null. and.errorCode: ", "HuaweiApiAvailabilityImpl");
        } else {
            AbstractC7222ym.m26244u(i, "Enter resolveError, param pendingIntent is  null. get pendingIntent from error code.and.errorCode: ", "HuaweiApiAvailabilityImpl");
            pendingIntent = getResolveErrorPendingIntent(activity, i);
        }
        if (pendingIntent != null) {
            AbstractC7222ym.m26244u(i, "In resolveError, start pendingIntent.errorCode: ", "HuaweiApiAvailabilityImpl");
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.m12620e("HuaweiApiAvailabilityImpl", "Enter resolveError, start pendingIntent failed.errorCode: " + i);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        m11495a(activity, errorDialog, HuaweiMobileServicesUtil.HMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    private UpdateBean m11494a(Context context) {
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(context).getHMSPackageName());
        if (TextUtils.isEmpty(updateBean.getClientPackageName())) {
            updateBean.setClientPackageName(PackageConstants.SERVICES_PACKAGE);
        }
        updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
        updateBean.setClientAppId("C10132067");
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context);
        }
        try {
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("getString has Exception:"), "HuaweiApiAvailabilityImpl");
        }
        return updateBean;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return m11490a(activity, i, DialogRedirect.getInstance(activity, m11491a(activity, i), i2), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i, i2, onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, int i, int i2) {
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i + " requestCode: " + i2);
        Intent resolveErrorIntent = getResolveErrorIntent(context, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(context, i2, resolveErrorIntent, 67108864);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        if (huaweiApiCallable != null) {
            try {
                m11496a(huaweiApiCallable);
            } catch (AvailabilityException e) {
                HMSLog.m12622i("HuaweiApiAvailabilityImpl", "HuaweiApiCallable checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                m11496a(huaweiApiCallable2);
            }
        }
        return c8499Wu1;
    }

    public PendingIntent getResolveErrorPendingIntent(Context context, int i) {
        AbstractC7222ym.m26244u(i, "Enter getResolveErrorPendingIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        Intent resolveErrorIntent = getResolveErrorIntent(context, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(context, 0, resolveErrorIntent, 67108864);
        }
        return null;
    }

    public Intent getResolveErrorIntent(Context context, int i) {
        AbstractC7222ym.m26244u(i, "Enter getResolveErrorIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (i == 1 || i == 2) {
            if (Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context)) {
                return (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "getStartUpdateIntent", new Object[]{context, m11494a(context.getApplicationContext())});
            }
            return m11493a(context, NotInstalledHmsResolution.class.getName());
        }
        if (i != 6) {
            if (i == 9 && Util.isAvailableLibExist(context)) {
                return m11493a(context, AppSpoofResolution.class.getName());
            }
            return null;
        }
        return m11493a(context, BindingFailedResolution.class.getName());
    }

    /* renamed from: a */
    private Intent m11491a(Activity activity, int i) {
        AbstractC7222ym.m26244u(i, "getErrorResolutionIntent, errorCode: ", "HuaweiApiAvailabilityImpl");
        if (i == 1 || i == 2) {
            if (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) {
                return (Intent) UpdateAdapter.invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdateIntent", new Object[]{activity});
            }
            return BridgeActivity.getIntentStartBridgeActivity(activity, DoNothingResolution.class.getName());
        }
        if (i != 6) {
            if (i == 9 && Util.isAvailableLibExist(activity)) {
                return BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName());
            }
            return null;
        }
        return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
    }

    /* renamed from: a */
    private static Dialog m11490a(Activity activity, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, UIUtil.getDialogThemeId(activity));
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        builder.setPositiveButton(ConnectionErrorMessages.getErrorDialogButtonMessage(activity, i), dialogRedirect);
        if (Util.isAvailableLibExist(activity) && AvailableUtil.isInstallerLibExist(activity)) {
            String errorTitle = ConnectionErrorMessages.getErrorTitle(activity, i);
            if (errorTitle != null) {
                builder.setTitle(errorTitle);
            }
        } else {
            String errorTitle2 = ConnectionErrorMessages.getErrorTitle(activity, i);
            if (errorTitle2 != null) {
                builder.setTitle(errorTitle2);
            }
        }
        return builder.create();
    }

    /* renamed from: a */
    private static void m11495a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: a */
    private void m11496a(Object obj) throws AvailabilityException {
        ConnectionResult connectionResult;
        AvailabilityException availabilityException = new AvailabilityException();
        if (obj instanceof HuaweiApi) {
            connectionResult = availabilityException.getConnectionResult((HuaweiApi<? extends Api.ApiOptions>) obj);
        } else {
            connectionResult = availabilityException.getConnectionResult((HuaweiApiCallable) obj);
        }
        if (connectionResult.getErrorCode() == 0) {
            return;
        }
        HMSLog.m12622i("HuaweiApiAvailabilityImpl", "The service is unavailable: " + availabilityException.getMessage());
        throw availabilityException;
    }
}
