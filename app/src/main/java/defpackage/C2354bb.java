package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: bb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2354bb extends EO1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2354bb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.EO1
    public final void a(int i, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                O90.f(charSequence, "errString");
                RU0 ru0 = (RU0) this.b;
                if (i != 10 && i != 13) {
                    ru0.resumeWith(RQ1.b(new C1891Ya("Could not authenticate the user")));
                    break;
                } else {
                    ru0.resumeWith(RQ1.b(new C1891Ya("User canceled the authentication")));
                    break;
                }
            default:
                O90.f(charSequence, "errString");
                QQ0 qq0 = (QQ0) ((C1288Qh) this.b).g;
                if (i == 10) {
                    ((Promise) qq0.a).reject("AuthenticationCanceledByUser", "User cancellation");
                    break;
                } else if (i == 13) {
                    ((Promise) qq0.a).reject("AuthenticationCanceledByUser", "User cancellation");
                    break;
                } else {
                    String string = charSequence.toString();
                    O90.f(string, "message");
                    ((Promise) qq0.a).reject(String.valueOf(i), string);
                    break;
                }
        }
    }

    @Override // defpackage.EO1
    public final void e(C0665Ih c0665Ih) {
        switch (this.a) {
            case 0:
                O90.f(c0665Ih, "result");
                ((RU0) this.b).resumeWith(c0665Ih);
                break;
            default:
                O90.f(c0665Ih, "result");
                QQ0 qq0 = (QQ0) ((C1288Qh) this.b).g;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putBoolean("success", true);
                ((Promise) qq0.a).resolve(writableNativeMap);
                break;
        }
    }
}
