package p000;

import com.RNTextInputMask.RNTextInputMaskModule;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: uE */
/* loaded from: classes.dex */
public final /* synthetic */ class C6936uE implements InterfaceC8216Rj0, InterfaceC8571Ye1 {

    /* renamed from: a */
    public final /* synthetic */ int f43599a;

    /* renamed from: b */
    public final /* synthetic */ Object f43600b;

    /* renamed from: c */
    public final /* synthetic */ Object f43601c;

    /* renamed from: d */
    public final /* synthetic */ Object f43602d;

    public /* synthetic */ C6936uE(int i, C1514Y3 c1514y3, HB0 hb0, HB0 hb02) {
        this.f43600b = c1514y3;
        this.f43599a = i;
        this.f43601c = hb0;
        this.f43602d = hb02;
    }

    @Override // p000.InterfaceC8571Ye1
    /* renamed from: i */
    public void mo502i(C11856yu0 c11856yu0) {
        RNTextInputMaskModule.setMask$lambda$4(this.f43599a, (ReadableMap) this.f43600b, (RNTextInputMaskModule) this.f43601c, (String) this.f43602d, c11856yu0);
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
        C1514Y3 c1514y3 = (C1514Y3) this.f43600b;
        interfaceC1577Z3.getClass();
        interfaceC1577Z3.mo2224I(this.f43599a, c1514y3, (HB0) this.f43601c, (HB0) this.f43602d);
    }

    public /* synthetic */ C6936uE(int i, ReadableMap readableMap, RNTextInputMaskModule rNTextInputMaskModule, String str) {
        this.f43599a = i;
        this.f43600b = readableMap;
        this.f43601c = rNTextInputMaskModule;
        this.f43602d = str;
    }
}
