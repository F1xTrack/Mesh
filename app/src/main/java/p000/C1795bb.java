package p000;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: bb */
/* loaded from: classes2.dex */
public final class C1795bb extends EO1 {

    /* renamed from: a */
    public final /* synthetic */ int f17078a;

    /* renamed from: b */
    public final /* synthetic */ Object f17079b;

    public /* synthetic */ C1795bb(int i, Object obj) {
        this.f17078a = i;
        this.f17079b = obj;
    }

    @Override // p000.EO1
    /* renamed from: a */
    public final void mo2211a(int i, CharSequence charSequence) {
        switch (this.f17078a) {
            case 0:
                O90.m5968f(charSequence, "errString");
                RU0 ru0 = (RU0) this.f17079b;
                if (i != 10 && i != 13) {
                    ru0.resumeWith(RQ1.m7015b(new C1547Ya("Could not authenticate the user")));
                    break;
                } else {
                    ru0.resumeWith(RQ1.m7015b(new C1547Ya("User canceled the authentication")));
                    break;
                }
            default:
                O90.m5968f(charSequence, "errString");
                QQ0 qq0 = (QQ0) ((C1051Qh) this.f17079b).f9736g;
                if (i == 10) {
                    ((Promise) qq0.f9619a).reject("AuthenticationCanceledByUser", "User cancellation");
                    break;
                } else if (i == 13) {
                    ((Promise) qq0.f9619a).reject("AuthenticationCanceledByUser", "User cancellation");
                    break;
                } else {
                    String string = charSequence.toString();
                    O90.m5968f(string, "message");
                    ((Promise) qq0.f9619a).reject(String.valueOf(i), string);
                    break;
                }
        }
    }

    @Override // p000.EO1
    /* renamed from: e */
    public final void mo2213e(C0548Ih c0548Ih) {
        switch (this.f17078a) {
            case 0:
                O90.m5968f(c0548Ih, "result");
                ((RU0) this.f17079b).resumeWith(c0548Ih);
                break;
            default:
                O90.m5968f(c0548Ih, "result");
                QQ0 qq0 = (QQ0) ((C1051Qh) this.f17079b).f9736g;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("success", true);
                ((Promise) qq0.f9619a).resolve(writableNativeMap);
                break;
        }
    }
}
