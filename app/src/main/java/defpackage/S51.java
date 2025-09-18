package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Range;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.android.replay.video.a;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* loaded from: classes2.dex */
public final class S51 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S51(int i, Object obj) {
        super(0);
        this.e = i;
        this.f = obj;
    }

    private final Object a() {
        C6140nm1 c6140nm1;
        C6140nm1 c6140nm12;
        C0939Lu1 c0939Lu1 = (C0939Lu1) this.f;
        synchronized (c0939Lu1.e) {
            try {
                C1089Ns1 c1089Ns1E = c0939Lu1.a.e();
                if (c1089Ns1E != null) {
                    c0939Lu1.c.getClass();
                    c6140nm1 = new C6140nm1(c1089Ns1E.a, c1089Ns1E.b, c1089Ns1E.c);
                } else {
                    c6140nm1 = null;
                }
                A12 a12A = c0939Lu1.b.a(c6140nm1);
                if (a12A instanceof C4048gt1) {
                    c6140nm12 = ((C4048gt1) a12A).a;
                } else {
                    if (!(a12A instanceof C5206it1)) {
                        throw new C7074sg();
                    }
                    C1442Sg0 c1442Sg0 = (C1442Sg0) c0939Lu1.a.b;
                    Set setG0 = AbstractC8069xu.g0(c1442Sg0.a());
                    List listA = c1442Sg0.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listA) {
                        if (setG0.contains((C0369Em0) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0369Em0) it.next()).a.delete();
                    }
                    VH vh = c0939Lu1.a;
                    C0474Fv0 c0474Fv0 = c0939Lu1.d;
                    C6140nm1 c6140nm13 = ((C5206it1) a12A).a;
                    c0474Fv0.getClass();
                    O90.f(c6140nm13, "networkConfigDto");
                    vh.f(new C1089Ns1(c6140nm13.a, c6140nm13.b, c6140nm13.c));
                    c6140nm12 = ((C5206it1) a12A).a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6140nm12;
    }

    private final Object e() {
        C0709Iv1 c0709Iv1 = (C0709Iv1) this.f;
        synchronized (c0709Iv1.f) {
            if (!c0709Iv1.g) {
                Object systemService = c0709Iv1.a.a.getSystemService((Class<Object>) JobScheduler.class);
                O90.e(systemService, "applicationContext.getSy…JobScheduler::class.java)");
                ((JobScheduler) systemService).cancel(12857125);
                C2034Zv1 c2034Zv1 = c0709Iv1.d;
                C3294cw1 c3294cw1 = new C3294cw1("sdkInfo", (Map) c2034Zv1.c.getValue());
                C7887ww1 c7887ww1 = c2034Zv1.a;
                c7887ww1.getClass();
                AbstractC6080nS1.a(new C4074h11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C1719Vu1(c7887ww1, 2, c3294cw1)), new C5661lG0(23, c7887ww1), 1), FK.a()), C1404Rt1.m), C5284jI.w, C1404Rt1.k);
                c0709Iv1.c.c();
                c0709Iv1.g = true;
            }
        }
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        InterfaceC6646qQ0 interfaceC6646qQ0;
        Object objB;
        PackageInfo packageInfo;
        String str;
        String str2;
        switch (this.e) {
            case 0:
                AbstractC7452ue1 abstractC7452ue1F = ((C7833we1) this.f).f();
                abstractC7452ue1F.getClass();
                return new C7833we1(abstractC7452ue1F);
            case 1:
                return C5496kP.c(EnumC5305jP.y, ((ES1) this.f).toString());
            case 2:
                OM om = (OM) this.f;
                synchronized (om.g) {
                    try {
                        if (!om.h) {
                            int iInvoke = om.c.invoke();
                            if (iInvoke == 0) {
                                throw null;
                            }
                            int i = iInvoke - 1;
                            if (i == 1) {
                                om.d.b();
                                interfaceC6646qQ0 = om.d;
                            } else if (i != 2) {
                                om.b.a();
                                C2034Zv1 c2034Zv1 = om.f;
                                C3294cw1 c3294cw1 = new C3294cw1("sdkInfo", (Map) c2034Zv1.c.getValue());
                                C7887ww1 c7887ww1 = c2034Zv1.a;
                                c7887ww1.getClass();
                                AbstractC6080nS1.a(new C4074h11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C1719Vu1(c7887ww1, 2, c3294cw1)), new C5661lG0(23, c7887ww1), 1), FK.a()), C1404Rt1.m), C5284jI.w, C0190Ce1.g);
                                om.d.c();
                                om.h = true;
                            } else {
                                interfaceC6646qQ0 = om.d;
                            }
                            interfaceC6646qQ0.d();
                            om.b.a();
                            C2034Zv1 c2034Zv12 = om.f;
                            C3294cw1 c3294cw12 = new C3294cw1("sdkInfo", (Map) c2034Zv12.c.getValue());
                            C7887ww1 c7887ww12 = c2034Zv12.a;
                            c7887ww12.getClass();
                            AbstractC6080nS1.a(new C4074h11(AbstractC6653qS1.c(new C4265i11(new C3311d11(new C1719Vu1(c7887ww12, 2, c3294cw12)), new C5661lG0(23, c7887ww12), 1), FK.a()), C1404Rt1.m), C5284jI.w, C0190Ce1.g);
                            om.d.c();
                            om.h = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C1518Tf1.a;
            case 3:
                return (List) ((C1680Vh1) this.f).m.getValue();
            case 4:
                ((C0166Bw1) ((C1241Pr0) this.f).d).getClass();
                return new URL("https://client-api.remote-config.rustore.ru/api/get");
            case 5:
                return ((C0544Gs1) this.f).c.getCountryId();
            case 6:
                C0999Mo1 c0999Mo1 = (C0999Mo1) this.f;
                ApplicationInfo applicationInfo = ((Context) c0999Mo1.a).getPackageManager().getApplicationInfo(((Context) c0999Mo1.a).getPackageName(), 128);
                O90.e(applicationInfo, "pm.getApplicationInfo(co…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                return new C5585ks1(bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null);
            case 7:
                C2192ak1 c2192ak1 = (C2192ak1) this.f;
                try {
                    PackageManager packageManager = ((Context) c2192ak1.b).getPackageManager();
                    O90.e(packageManager, "context.packageManager");
                    String packageName = ((Context) c2192ak1.b).getPackageName();
                    O90.e(packageName, "context.packageName");
                    if (Build.VERSION.SDK_INT >= 33) {
                        packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                        str = "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }";
                    } else {
                        packageInfo = packageManager.getPackageInfo(packageName, 0);
                        str = "getPackageInfo";
                    }
                    O90.e(packageInfo, str);
                    str2 = packageInfo.versionName;
                } catch (Throwable th2) {
                    objB = RQ1.b(th2);
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objB = new C5397jt1(str2);
                if (objB instanceof OS0) {
                    objB = null;
                }
                C5397jt1 c5397jt1 = (C5397jt1) objB;
                String str3 = c5397jt1 != null ? c5397jt1.a : null;
                if (str3 != null) {
                    return new C5397jt1(str3);
                }
                return null;
            case 8:
                C1101Nw1 c1101Nw1 = ((C4242hu1) this.f).b;
                C5806m12 c5806m12 = c1101Nw1.a;
                return AbstractC7096sn0.h(new Pair("sdkName", "ru.rustore.sdk:review"), new Pair("sdkType", AbstractC7209tN0.r(AbstractC2135aR1.a((Map) c1101Nw1.b.b).b)), new Pair("sdkVersion", "6.0.0"));
            case 9:
                return a();
            case 10:
                ((N8) ((C2226aw) this.f).b).e();
                return C1518Tf1.a;
            case 11:
                C1666Vd c1666Vd = (C1666Vd) this.f;
                a aVar = (a) c1666Vd.d;
                D1 d1 = (D1) c1666Vd.c;
                a aVar2 = (a) c1666Vd.d;
                int iIntValue = aVar.e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) c1666Vd.f).getCodecInfo().getCapabilitiesForType(aVar2.f).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                        d1.getLogger().k(EnumC5148n1.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        O90.e(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        iIntValue = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th3) {
                    d1.getLogger().d(EnumC5148n1.DEBUG, "Could not retrieve MediaCodec info", th3);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(aVar2.f, aVar2.b, aVar2.c);
                O90.e(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar2.d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 12:
                C1173Ou1 c1173Ou1 = (C1173Ou1) this.f;
                AbstractC3767fP1.b(c1173Ou1.d, null, new C5785lv1(c1173Ou1, null, 0), 3);
                return C1518Tf1.a;
            case 13:
                OL0 ol0 = ((C2034Zv1) this.f).b.a;
                return AbstractC7096sn0.h(new Pair("sdkName", "ru.rustore.sdk:remoteconfig"), new Pair("sdkType", AbstractC7209tN0.r(AbstractC2135aR1.a(null).b)), new Pair("sdkVersion", "6.2.0-alpha01"));
            case 14:
                return e();
            case 15:
                C1518Tf1 c1518Tf1 = C1518Tf1.a;
                ((C5423k11) this.f).c(c1518Tf1);
                return c1518Tf1;
            case 16:
                ((C3759fN) ((C1632Ur1) this.f).b).getClass();
                return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
            default:
                C7691vu1 c7691vu1A = ((C0790Jw1) this.f).a.a();
                if (c7691vu1A != null) {
                    return new C8457zw1(new RemoteConfig(c7691vu1A.b), c7691vu1A.d);
                }
                return null;
        }
    }
}
