package defpackage;

import com.RNTextInputMask.RNTextInputMaskModule;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: uE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7372uE implements InterfaceC1373Rj0, InterfaceC1905Ye1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C7372uE(int i, Y3 y3, HB0 hb0, HB0 hb02) {
        this.b = y3;
        this.a = i;
        this.c = hb0;
        this.d = hb02;
    }

    @Override // defpackage.InterfaceC1905Ye1
    public void i(C8260yu0 c8260yu0) {
        RNTextInputMaskModule.setMask$lambda$4(this.a, (ReadableMap) this.b, (RNTextInputMaskModule) this.c, (String) this.d, c8260yu0);
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        Z3 z3 = (Z3) obj;
        Y3 y3 = (Y3) this.b;
        z3.getClass();
        z3.I(this.a, y3, (HB0) this.c, (HB0) this.d);
    }

    public /* synthetic */ C7372uE(int i, ReadableMap readableMap, RNTextInputMaskModule rNTextInputMaskModule, String str) {
        this.a = i;
        this.b = readableMap;
        this.c = rNTextInputMaskModule;
        this.d = str;
    }
}
