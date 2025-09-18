package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.emoji2.text.flatbuffer.FlexBuffers;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.appmetrica.analytics.impl.C5043c9;
import java.util.HashMap;

/* renamed from: mF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC10242mF1 extends AbstractBinderC10876rC1 implements InterfaceC8701aF1 {
    public static InterfaceC8701aF1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8701aF1 ? (InterfaceC8701aF1) iInterfaceQueryLocalInterface : new C9730iF1(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC11266uF1 cf1;
        boolean z;
        InterfaceC11266uF1 cf12 = null;
        InterfaceC11648xF1 hf1 = null;
        InterfaceC11266uF1 cf13 = null;
        InterfaceC11266uF1 cf14 = null;
        InterfaceC11266uF1 cf15 = null;
        InterfaceC11266uF1 cf16 = null;
        OF1 yf1 = null;
        OF1 yf12 = null;
        OF1 yf13 = null;
        InterfaceC11266uF1 cf17 = null;
        InterfaceC11266uF1 cf18 = null;
        InterfaceC11266uF1 cf19 = null;
        InterfaceC11266uF1 cf110 = null;
        InterfaceC11266uF1 cf111 = null;
        InterfaceC11266uF1 cf112 = null;
        UF1 c10628pG1 = null;
        InterfaceC11266uF1 cf113 = null;
        InterfaceC11266uF1 cf114 = null;
        InterfaceC11266uF1 cf115 = null;
        InterfaceC11266uF1 cf116 = null;
        switch (i) {
            case 1:
                InterfaceC9197e50 interfaceC9197e50M10546G = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                C9092dG1 c9092dG1 = (C9092dG1) AbstractC10364nC1.m23100a(parcel, C9092dG1.CREATOR);
                long j = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                initialize(interfaceC9197e50M10546G, c9092dG1, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    cf1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf1 = iInterfaceQueryLocalInterface instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface : new CF1(strongBinder);
                }
                long j3 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                logEventAndBundle(string3, string4, bundle2, cf1, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC9197e50 interfaceC9197e50M10546G2 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC10364nC1.f38178a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setUserProperty(string5, string6, interfaceC9197e50M10546G2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC10364nC1.f38178a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf12 = iInterfaceQueryLocalInterface2 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface2 : new CF1(strongBinder2);
                }
                AbstractC10364nC1.m23103d(parcel);
                getUserProperties(string7, string8, z, cf12);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf116 = iInterfaceQueryLocalInterface3 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface3 : new CF1(strongBinder3);
                }
                AbstractC10364nC1.m23103d(parcel);
                getMaxUserProperties(string9, cf116);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf115 = iInterfaceQueryLocalInterface4 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface4 : new CF1(strongBinder4);
                }
                AbstractC10364nC1.m23103d(parcel);
                getConditionalUserProperties(string13, string14, cf115);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC10364nC1.f38178a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                InterfaceC9197e50 interfaceC9197e50M10546G3 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setCurrentScreen(interfaceC9197e50M10546G3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf114 = iInterfaceQueryLocalInterface5 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface5 : new CF1(strongBinder5);
                }
                AbstractC10364nC1.m23103d(parcel);
                getCurrentScreenName(cf114);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf113 = iInterfaceQueryLocalInterface6 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface6 : new CF1(strongBinder6);
                }
                AbstractC10364nC1.m23103d(parcel);
                getCurrentScreenClass(cf113);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c10628pG1 = iInterfaceQueryLocalInterface7 instanceof UF1 ? (UF1) iInterfaceQueryLocalInterface7 : new C10628pG1(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                AbstractC10364nC1.m23103d(parcel);
                setInstanceIdProvider(c10628pG1);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf112 = iInterfaceQueryLocalInterface8 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface8 : new CF1(strongBinder8);
                }
                AbstractC10364nC1.m23103d(parcel);
                getCachedAppInstanceId(cf112);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf111 = iInterfaceQueryLocalInterface9 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface9 : new CF1(strongBinder9);
                }
                AbstractC10364nC1.m23103d(parcel);
                getAppInstanceId(cf111);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf110 = iInterfaceQueryLocalInterface10 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface10 : new CF1(strongBinder10);
                }
                AbstractC10364nC1.m23103d(parcel);
                getGmpAppId(cf110);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf19 = iInterfaceQueryLocalInterface11 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface11 : new CF1(strongBinder11);
                }
                AbstractC10364nC1.m23103d(parcel);
                generateEventId(cf19);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                InterfaceC9197e50 interfaceC9197e50M10546G4 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityStarted(interfaceC9197e50M10546G4, j14);
                break;
            case 26:
                InterfaceC9197e50 interfaceC9197e50M10546G5 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityStopped(interfaceC9197e50M10546G5, j15);
                break;
            case 27:
                InterfaceC9197e50 interfaceC9197e50M10546G6 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityCreated(interfaceC9197e50M10546G6, bundle5, j16);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                InterfaceC9197e50 interfaceC9197e50M10546G7 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityDestroyed(interfaceC9197e50M10546G7, j17);
                break;
            case 29:
                InterfaceC9197e50 interfaceC9197e50M10546G8 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityPaused(interfaceC9197e50M10546G8, j18);
                break;
            case 30:
                InterfaceC9197e50 interfaceC9197e50M10546G9 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityResumed(interfaceC9197e50M10546G9, j19);
                break;
            case 31:
                InterfaceC9197e50 interfaceC9197e50M10546G10 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf18 = iInterfaceQueryLocalInterface12 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface12 : new CF1(strongBinder12);
                }
                long j20 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivitySaveInstanceState(interfaceC9197e50M10546G10, cf18, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf17 = iInterfaceQueryLocalInterface13 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface13 : new CF1(strongBinder13);
                }
                long j21 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                performAction(bundle6, cf17, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC9197e50 interfaceC9197e50M10546G11 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                InterfaceC9197e50 interfaceC9197e50M10546G12 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                InterfaceC9197e50 interfaceC9197e50M10546G13 = BinderC8916bx0.m10546G(parcel.readStrongBinder());
                AbstractC10364nC1.m23103d(parcel);
                logHealthData(i2, string19, interfaceC9197e50M10546G11, interfaceC9197e50M10546G12, interfaceC9197e50M10546G13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    yf13 = iInterfaceQueryLocalInterface14 instanceof OF1 ? (OF1) iInterfaceQueryLocalInterface14 : new YF1(strongBinder14);
                }
                AbstractC10364nC1.m23103d(parcel);
                setEventInterceptor(yf13);
                break;
            case C5043c9.f31374J /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    yf12 = iInterfaceQueryLocalInterface15 instanceof OF1 ? (OF1) iInterfaceQueryLocalInterface15 : new YF1(strongBinder15);
                }
                AbstractC10364nC1.m23103d(parcel);
                registerOnMeasurementEventListener(yf12);
                break;
            case FlexBuffers.FBT_VECTOR_BOOL /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    yf1 = iInterfaceQueryLocalInterface16 instanceof OF1 ? (OF1) iInterfaceQueryLocalInterface16 : new YF1(strongBinder16);
                }
                AbstractC10364nC1.m23103d(parcel);
                unregisterOnMeasurementEventListener(yf1);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(AbstractC10364nC1.f38178a);
                AbstractC10364nC1.m23103d(parcel);
                initForTests(hashMap);
                break;
            case C5043c9.f31375K /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf16 = iInterfaceQueryLocalInterface17 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface17 : new CF1(strongBinder17);
                }
                int i3 = parcel.readInt();
                AbstractC10364nC1.m23103d(parcel);
                getTestFlag(cf16, i3);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC10364nC1.f38178a;
                z = parcel.readInt() != 0;
                AbstractC10364nC1.m23103d(parcel);
                setDataCollectionEnabled(z);
                break;
            case C5043c9.f31376L /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf15 = iInterfaceQueryLocalInterface18 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface18 : new CF1(strongBinder18);
                }
                AbstractC10364nC1.m23103d(parcel);
                isDataCollectionEnabled(cf15);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case C5043c9.f31377M /* 42 */:
                Bundle bundle7 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf14 = iInterfaceQueryLocalInterface19 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface19 : new CF1(strongBinder19);
                }
                AbstractC10364nC1.m23103d(parcel);
                getSessionId(cf14);
                break;
            case 48:
                Intent intent = (Intent) AbstractC10364nC1.m23100a(parcel, Intent.CREATOR);
                AbstractC10364nC1.m23103d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                C11268uG1 c11268uG1 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                setCurrentScreenByScionActivityInfo(c11268uG1, string20, string21, j25);
                break;
            case 51:
                C11268uG1 c11268uG12 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                long j26 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityStartedByScionActivityInfo(c11268uG12, j26);
                break;
            case 52:
                C11268uG1 c11268uG13 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                long j27 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityStoppedByScionActivityInfo(c11268uG13, j27);
                break;
            case 53:
                C11268uG1 c11268uG14 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityCreatedByScionActivityInfo(c11268uG14, bundle10, j28);
                break;
            case 54:
                C11268uG1 c11268uG15 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                long j29 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityDestroyedByScionActivityInfo(c11268uG15, j29);
                break;
            case 55:
                C11268uG1 c11268uG16 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                long j30 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityPausedByScionActivityInfo(c11268uG16, j30);
                break;
            case 56:
                C11268uG1 c11268uG17 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                long j31 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivityResumedByScionActivityInfo(c11268uG17, j31);
                break;
            case 57:
                C11268uG1 c11268uG18 = (C11268uG1) AbstractC10364nC1.m23100a(parcel, C11268uG1.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cf13 = iInterfaceQueryLocalInterface20 instanceof InterfaceC11266uF1 ? (InterfaceC11266uF1) iInterfaceQueryLocalInterface20 : new CF1(strongBinder20);
                }
                long j32 = parcel.readLong();
                AbstractC10364nC1.m23103d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(c11268uG18, cf13, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    hf1 = iInterfaceQueryLocalInterface21 instanceof InterfaceC11648xF1 ? (InterfaceC11648xF1) iInterfaceQueryLocalInterface21 : new HF1(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                AbstractC10364nC1.m23103d(parcel);
                retrieveAndUploadBatches(hf1);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
