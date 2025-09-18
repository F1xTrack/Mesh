package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.react.bridge.UIManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.vk.push.common.Logger;
import expo.modules.kotlin.jni.JNIFunctionBody;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.M5;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class EE implements XG, InterfaceC8207yc1, InterfaceC1373Rj0, InterfaceC1651Uy, InterfaceC6696qh, InterfaceC0443Fl, InterfaceC6290oZ, InterfaceC3569eN0, InterfaceC8104y40, InterfaceC3328d60, JNIFunctionBody, InterfaceC6021n9, ActivationBarrierCallback, InterfaceC1934Yo0, InterfaceC4285i70, InterfaceC2558cf1, InterfaceC1568Tw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ EE(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1934Yo0
    public int a(Object obj) {
        C1076No0 c1076No0 = (C1076No0) obj;
        c1076No0.getClass();
        C6666qX c6666qX = (C6666qX) this.b;
        String str = c6666qX.m;
        String str2 = c1076No0.b;
        return ((str2.equals(str) || str2.equals(AbstractC2012Zo0.b(c6666qX))) && c1076No0.c(c6666qX, false)) ? 1 : 0;
    }

    @Override // defpackage.InterfaceC8207yc1
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        return (InterfaceFutureC0750Jj0) ((C8277z) this.b).invoke(obj);
    }

    public boolean b(C0481Fx1 c0481Fx1, int i, Bundle bundle) {
        InterfaceC8081xy c3513e41;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((D80) c0481Fx1.a).h();
                Parcelable parcelable = (Parcelable) ((D80) c0481Fx1.a).r();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription description = ((D80) c0481Fx1.a).getDescription();
        D80 d80 = (D80) c0481Fx1.a;
        ClipData clipData = new ClipData(description, new ClipData.Item(d80.e()));
        if (i2 >= 31) {
            c3513e41 = new C3513e41(clipData, 2);
        } else {
            C8271yy c8271yy = new C8271yy();
            c8271yy.b = clipData;
            c8271yy.c = 2;
            c3513e41 = c8271yy;
        }
        c3513e41.J(d80.i());
        c3513e41.setExtras(bundle);
        return AbstractC6897rk1.j((L6) this.b, c3513e41.a()) == null;
    }

    @Override // defpackage.InterfaceC1568Tw0
    public Object c() {
        InterfaceC0196Cg1 interfaceC0196Cg1 = (InterfaceC0196Cg1) this.b;
        O90.f(interfaceC0196Cg1, "$allocator");
        return interfaceC0196Cg1.a();
    }

    public void d(SpannableStringBuilder spannableStringBuilder) {
        String strM = D51.m(D51.m(D51.m(D51.m(D51.m(D51.m(D51.m(D51.m(((C5410jy) this.b).a, "\r\n", "<br>"), "\n", "<br>"), " ", "&nbsp;"), "\t", "&nbsp;&nbsp;&nbsp;&nbsp;"), "<sub>", "<sub><small>"), "</sub>", "</small></sub>"), "<sup>", "<sup><small>"), "</sup>", "</small></sup>");
        Spanned spannedA = Build.VERSION.SDK_INT >= 24 ? S30.a(strM, 0) : Html.fromHtml(strM);
        O90.e(spannedA, "fromHtml(...)");
        spannableStringBuilder.append((CharSequence) spannedA);
    }

    @Override // defpackage.InterfaceC2558cf1
    public String e(String str) {
        return ((UIManager) this.b).resolveCustomDirectEventName(str);
    }

    @Override // defpackage.InterfaceC6696qh
    public long f(long j) {
        return AbstractC0277Dh1.k((j * r0.e) / 1000000, 0L, ((UV) this.b).j - 1);
    }

    @Override // defpackage.InterfaceC8104y40
    public void h(String str) {
        F71 f71 = (F71) this.b;
        O90.f(str, "it");
        Logger.DefaultImpls.info$default((Logger) f71.getValue(), str, null, 2, null);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        switch (this.a) {
            case 14:
                GW gw = (GW) this.b;
                gw.getClass();
                gw.b.execute(new RQ(gw, 3, c0365El));
                return "triggerAePrecapture";
            default:
                C0999Mo1 c0999Mo1 = (C0999Mo1) this.b;
                c0999Mo1.getClass();
                QR1.h().execute(new RQ(c0999Mo1, 15, c0365El));
                return c0999Mo1 + " [fetch@" + SystemClock.uptimeMillis() + "]";
        }
    }

    @Override // defpackage.XG
    public C3769fQ0 i(int i, C1272Qb1 c1272Qb1, int[] iArr) {
        M70 m70T = P70.t();
        for (int i2 = 0; i2 < c1272Qb1.a; i2++) {
            int i3 = i2;
            m70T.a(new QG(i, c1272Qb1, i3, (TG) this.b, iArr[i2]));
        }
        return m70T.h();
    }

    @Override // defpackage.InterfaceC3328d60
    public void i0(C8197yZ0 c8197yZ0) {
        ((InterfaceC3328d60) this.b).i0(c8197yZ0);
    }

    @Override // expo.modules.kotlin.jni.JNIFunctionBody
    public Object invoke(Object[] objArr) {
        C7726w5 c7726w5 = (C7726w5) this.b;
        O90.f(objArr, "it");
        c7726w5.invoke();
        return C1518Tf1.a;
    }

    @Override // defpackage.InterfaceC4285i70
    public void k(InterfaceC5252j70 interfaceC5252j70) {
        C0696Ir0 c0696Ir0 = (C0696Ir0) this.b;
        synchronized (c0696Ir0.a) {
            c0696Ir0.c++;
        }
        c0696Ir0.g(interfaceC5252j70);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        M5.a((M5) this.b);
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) throws IOException {
        Object obj;
        switch (this.a) {
            case 12:
                return (C7232tV) ((C3892g32) this.b).i();
            default:
                ((C1241Pr0) this.b).getClass();
                C3892g32 c3892g32 = (C3892g32) task;
                synchronized (c3892g32.a) {
                    Preconditions.checkState(c3892g32.c, "Task is not yet complete");
                    if (c3892g32.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(c3892g32.f)) {
                        throw ((Throwable) IOException.class.cast(c3892g32.f));
                    }
                    Exception exc = c3892g32.f;
                    if (exc != null) {
                        throw new C5703lU0(exc);
                    }
                    obj = c3892g32.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                bundle.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // defpackage.InterfaceC8207yc1
    public Object apply(Object obj) throws IOException {
        switch (this.a) {
            case 4:
                OY0 oy0 = (OY0) obj;
                ((C0136Bm1) this.b).getClass();
                String strV = PY0.b.v(oy0);
                O90.e(strV, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                oy0.getClass();
                byte[] bytes = strV.getBytes(AbstractC7680vr.a);
                O90.e(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            default:
                C1038Nb1 c1038Nb1 = (C1038Nb1) obj;
                ((KY) this.b).getClass();
                return c1038Nb1;
        }
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        switch (this.a) {
            case 5:
                gb0.t((C7484up0) this.b);
                break;
            case 6:
                gb0.b((Q9) this.b);
                break;
            case 7:
                gb0.n((C7554vB) this.b);
                break;
            case 8:
                gb0.t(((UQ) this.b).a.O);
                break;
            case 9:
                gb0.F((C0540Gr0) this.b);
                break;
            default:
                gb0.e((C1530Tj1) this.b);
                break;
        }
    }
}
