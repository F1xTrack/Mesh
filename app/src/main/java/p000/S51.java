package p000;

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
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.video.C5967a;
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
public final class S51 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f10579e;

    /* renamed from: f */
    public final /* synthetic */ Object f10580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S51(int i, Object obj) {
        super(0);
        this.f10579e = i;
        this.f10580f = obj;
    }

    /* renamed from: a */
    private final Object m7178a() {
        C10436nm1 c10436nm1;
        C10436nm1 c10436nm12;
        C7927Lu1 c7927Lu1 = (C7927Lu1) this.f10580f;
        synchronized (c7927Lu1.f6928e) {
            try {
                C8027Ns1 c8027Ns1M8363e = c7927Lu1.f6924a.m8363e();
                if (c8027Ns1M8363e != null) {
                    c7927Lu1.f6926c.getClass();
                    c10436nm1 = new C10436nm1(c8027Ns1M8363e.f8099a, c8027Ns1M8363e.f8100b, c8027Ns1M8363e.f8101c);
                } else {
                    c10436nm1 = null;
                }
                A12 a12M4390a = c7927Lu1.f6925b.m4390a(c10436nm1);
                if (a12M4390a instanceof C9554gt1) {
                    c10436nm12 = ((C9554gt1) a12M4390a).f28076a;
                } else {
                    if (!(a12M4390a instanceof C9810it1)) {
                        throw new C6838sg();
                    }
                    C8262Sg0 c8262Sg0 = (C8262Sg0) c7927Lu1.f6924a.f12486b;
                    Set setM25987g0 = AbstractC7167xu.m25987g0(c8262Sg0.m7417a());
                    List listM7417a = c8262Sg0.m7417a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM7417a) {
                        if (setM25987g0.contains((C7546Em0) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C7546Em0) it.next()).f2897a.delete();
                    }
                    C1339VH c1339vh = c7927Lu1.f6924a;
                    C7616Fv0 c7616Fv0 = c7927Lu1.f6927d;
                    C10436nm1 c10436nm13 = ((C9810it1) a12M4390a).f34794a;
                    c7616Fv0.getClass();
                    O90.m5968f(c10436nm13, "networkConfigDto");
                    c1339vh.m8364f(new C8027Ns1(c10436nm13.f38503a, c10436nm13.f38504b, c10436nm13.f38505c));
                    c10436nm12 = ((C9810it1) a12M4390a).f34794a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10436nm12;
    }

    /* renamed from: e */
    private final Object m7179e() {
        C7773Iv1 c7773Iv1 = (C7773Iv1) this.f10580f;
        synchronized (c7773Iv1.f5206f) {
            if (!c7773Iv1.f5207g) {
                Object systemService = c7773Iv1.f5201a.f4605a.getSystemService((Class<Object>) JobScheduler.class);
                O90.m5967e(systemService, "applicationContext.getSy…JobScheduler::class.java)");
                ((JobScheduler) systemService).cancel(12857125);
                C8657Zv1 c8657Zv1 = c7773Iv1.f5204d;
                C9048cw1 c9048cw1 = new C9048cw1("sdkInfo", (Map) c8657Zv1.f15231c.getValue());
                C11607ww1 c11607ww1 = c8657Zv1.f15229a;
                c11607ww1.getClass();
                AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C8447Vu1(c11607ww1, 2, c9048cw1)), new C10115lG0(23, c11607ww1), 1), AbstractC0336FK.m2578a()), C8237Rt1.f10477m), C6228jI.f35045w, C8237Rt1.f10475k);
                c7773Iv1.f5203c.mo1681c();
                c7773Iv1.f5207g = true;
            }
        }
        return C8313Tf1.f11463a;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        InterfaceC10775qQ0 interfaceC10775qQ0;
        Object objM7015b;
        PackageInfo packageInfo;
        String str;
        String str2;
        switch (this.f10579e) {
            case 0:
                AbstractC11316ue1 abstractC11316ue1M25665f = ((C11571we1) this.f10580f).m25665f();
                abstractC11316ue1M25665f.getClass();
                return new C11571we1(abstractC11316ue1M25665f);
            case 1:
                return C6298kP.m22197c(EnumC6235jP.f35140y, ((ES1) this.f10580f).toString());
            case 2:
                C0904OM c0904om = (C0904OM) this.f10580f;
                synchronized (c0904om.f8393g) {
                    try {
                        if (!c0904om.f8394h) {
                            int iInvoke = c0904om.f8389c.invoke();
                            if (iInvoke == 0) {
                                throw null;
                            }
                            int i = iInvoke - 1;
                            if (i == 1) {
                                c0904om.f8390d.mo1680b();
                                interfaceC10775qQ0 = c0904om.f8390d;
                            } else if (i != 2) {
                                c0904om.f8388b.m3649a();
                                C8657Zv1 c8657Zv1 = c0904om.f8392f;
                                C9048cw1 c9048cw1 = new C9048cw1("sdkInfo", (Map) c8657Zv1.f15231c.getValue());
                                C11607ww1 c11607ww1 = c8657Zv1.f15229a;
                                c11607ww1.getClass();
                                AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C8447Vu1(c11607ww1, 2, c9048cw1)), new C10115lG0(23, c11607ww1), 1), AbstractC0336FK.m2578a()), C8237Rt1.f10477m), C6228jI.f35045w, C7427Ce1.f1547g);
                                c0904om.f8390d.mo1681c();
                                c0904om.f8394h = true;
                            } else {
                                interfaceC10775qQ0 = c0904om.f8390d;
                            }
                            interfaceC10775qQ0.mo1682d();
                            c0904om.f8388b.m3649a();
                            C8657Zv1 c8657Zv12 = c0904om.f8392f;
                            C9048cw1 c9048cw12 = new C9048cw1("sdkInfo", (Map) c8657Zv12.f15231c.getValue());
                            C11607ww1 c11607ww12 = c8657Zv12.f15229a;
                            c11607ww12.getClass();
                            AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C8447Vu1(c11607ww12, 2, c9048cw12)), new C10115lG0(23, c11607ww12), 1), AbstractC0336FK.m2578a()), C8237Rt1.f10477m), C6228jI.f35045w, C7427Ce1.f1547g);
                            c0904om.f8390d.mo1681c();
                            c0904om.f8394h = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C8313Tf1.f11463a;
            case 3:
                return (List) ((C8421Vh1) this.f10580f).f12697m.getValue();
            case 4:
                ((C7411Bw1) ((C8128Pr0) this.f10580f).f9306d).getClass();
                return new URL("https://client-api.remote-config.rustore.ru/api/get");
            case 5:
                return ((C7663Gs1) this.f10580f).f3937c.getCountryId();
            case 6:
                C7967Mo1 c7967Mo1 = (C7967Mo1) this.f10580f;
                ApplicationInfo applicationInfo = ((Context) c7967Mo1.f7362a).getPackageManager().getApplicationInfo(((Context) c7967Mo1.f7362a).getPackageName(), 128);
                O90.m5967e(applicationInfo, "pm.getApplicationInfo(co…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                return new C10064ks1(bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null);
            case 7:
                C8763ak1 c8763ak1 = (C8763ak1) this.f10580f;
                try {
                    PackageManager packageManager = ((Context) c8763ak1.f15666b).getPackageManager();
                    O90.m5967e(packageManager, "context.packageManager");
                    String packageName = ((Context) c8763ak1.f15666b).getPackageName();
                    O90.m5967e(packageName, "context.packageName");
                    if (Build.VERSION.SDK_INT >= 33) {
                        packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                        str = "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }";
                    } else {
                        packageInfo = packageManager.getPackageInfo(packageName, 0);
                        str = "getPackageInfo";
                    }
                    O90.m5967e(packageInfo, str);
                    str2 = packageInfo.versionName;
                } catch (Throwable th2) {
                    objM7015b = RQ1.m7015b(th2);
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objM7015b = new C9938jt1(str2);
                if (objM7015b instanceof OS0) {
                    objM7015b = null;
                }
                C9938jt1 c9938jt1 = (C9938jt1) objM7015b;
                String str3 = c9938jt1 != null ? c9938jt1.f35445a : null;
                if (str3 != null) {
                    return new C9938jt1(str3);
                }
                return null;
            case 8:
                C8035Nw1 c8035Nw1 = ((C9684hu1) this.f10580f).f28672b;
                C10212m12 c10212m12 = c8035Nw1.f8141a;
                return AbstractC11077sn0.m24780h(new Pair("sdkName", "ru.rustore.sdk:review"), new Pair("sdkType", AbstractC11153tN0.m24906r(AbstractC8725aR1.m9741a((Map) c8035Nw1.f8142b.f40042b).f26623b)), new Pair("sdkVersion", "6.0.0"));
            case 9:
                return m7178a();
            case 10:
                ((C0827N8) ((C1753aw) this.f10580f).f16682b).m5556e();
                return C8313Tf1.f11463a;
            case 11:
                C1361Vd c1361Vd = (C1361Vd) this.f10580f;
                C5967a c5967a = (C5967a) c1361Vd.f12663d;
                C5759D1 c5759d1 = (C5759D1) c1361Vd.f12662c;
                C5967a c5967a2 = (C5967a) c1361Vd.f12663d;
                int iIntValue = c5967a.f34046e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) c1361Vd.f12665f).getCodecInfo().getCapabilitiesForType(c5967a2.f34047f).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        O90.m5967e(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        iIntValue = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th3) {
                    c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Could not retrieve MediaCodec info", th3);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c5967a2.f34047f, c5967a2.f34043b, c5967a2.f34044c);
                O90.m5967e(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", c5967a2.f34045d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 12:
                C8083Ou1 c8083Ou1 = (C8083Ou1) this.f10580f;
                AbstractC9366fP1.m18230b(c8083Ou1.f8672d, null, new C10198lv1(c8083Ou1, null, 0), 3);
                return C8313Tf1.f11463a;
            case 13:
                OL0 ol0 = ((C8657Zv1) this.f10580f).f15230b.f2979a;
                return AbstractC11077sn0.m24780h(new Pair("sdkName", "ru.rustore.sdk:remoteconfig"), new Pair("sdkType", AbstractC11153tN0.m24906r(AbstractC8725aR1.m9741a(null).f26623b)), new Pair("sdkVersion", "6.2.0-alpha01"));
            case 14:
                return m7179e();
            case 15:
                C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
                ((C9955k11) this.f10580f).m22134c(c8313Tf1);
                return c8313Tf1;
            case 16:
                ((C4049fN) ((C8389Ur1) this.f10580f).f12177b).getClass();
                return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
            default:
                C11476vu1 c11476vu1M17774a = ((C7827Jw1) this.f10580f).f5805a.m17774a();
                if (c11476vu1M17774a != null) {
                    return new C11988zw1(new RemoteConfig(c11476vu1M17774a.f44598b), c11476vu1M17774a.f44600d);
                }
                return null;
        }
    }
}
