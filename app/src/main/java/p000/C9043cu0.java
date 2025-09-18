package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: cu0 */
/* loaded from: classes.dex */
public final class C9043cu0 extends AbstractC9811iu0 {

    /* renamed from: b */
    public final /* synthetic */ int f25708b = 0;

    /* renamed from: c */
    public final /* synthetic */ int f25709c;

    /* renamed from: d */
    public final /* synthetic */ Object f25710d;

    /* renamed from: e */
    public final /* synthetic */ Object f25711e;

    public C9043cu0(int i, String str, ReadableMap readableMap) {
        this.f25709c = i;
        this.f25710d = str;
        this.f25711e = readableMap;
    }

    @Override // p000.AbstractC9811iu0
    /* renamed from: a */
    public final void mo9180a(C1881a c1881a) {
        switch (this.f25708b) {
            case 0:
                c1881a.m10924a(this.f25709c, (String) this.f25710d, (ReadableMap) this.f25711e);
                return;
            default:
                NativeAnimatedModule nativeAnimatedModule = (NativeAnimatedModule) this.f25711e;
                nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
                int i = 0;
                while (i < this.f25709c) {
                    int i2 = i + 1;
                    ReadableArray readableArray = (ReadableArray) this.f25710d;
                    int i3 = readableArray.getInt(i);
                    if (AbstractC0852NX.f7856a == null) {
                        AbstractC0852NX.f7856a = AbstractC7222ym.m26223C(21);
                    }
                    switch (AbstractC7222ym.m26247x(AbstractC0852NX.f7856a[i3 - 1])) {
                        case 0:
                            int i4 = i + 2;
                            i += 3;
                            c1881a.m10927d(readableArray.getInt(i2), readableArray.getMap(i4));
                            break;
                        case 1:
                            int i5 = i + 2;
                            i += 3;
                            c1881a.m10944u(readableArray.getInt(i2), readableArray.getMap(i5));
                            break;
                        case 2:
                            i += 2;
                            c1881a.m10933j(readableArray.getInt(i2), null);
                            break;
                        case 3:
                            i += 2;
                            int i6 = readableArray.getInt(i2);
                            c1881a.m10940q(i6, new C0986Pf(this, i6, 12));
                            break;
                        case 4:
                            i += 2;
                            c1881a.m10943t(readableArray.getInt(i2));
                            break;
                        case 5:
                            int i7 = i + 2;
                            i += 3;
                            c1881a.m10926c(readableArray.getInt(i2), readableArray.getInt(i7));
                            break;
                        case 6:
                            int i8 = i + 2;
                            i += 3;
                            c1881a.m10929f(readableArray.getInt(i2), readableArray.getInt(i8));
                            break;
                        case 7:
                            if (((C9773ib0) AbstractC10874rB1.f41370a).lazyAnimationCallbacks()) {
                                nativeAnimatedModule.enqueueFrameCallback();
                            }
                            int i9 = readableArray.getInt(i2);
                            int i10 = i + 3;
                            int i11 = readableArray.getInt(i + 2);
                            i += 4;
                            c1881a.m10939p(i9, readableArray.getMap(i10), null, i11);
                            break;
                        case 8:
                            i += 2;
                            c1881a.m10941r(readableArray.getInt(i2));
                            break;
                        case 9:
                            int i12 = i + 2;
                            i += 3;
                            c1881a.m10938o(readableArray.getInt(i2), readableArray.getDouble(i12));
                            break;
                        case 10:
                            int i13 = i + 2;
                            i += 3;
                            c1881a.m10938o(readableArray.getInt(i2), readableArray.getDouble(i13));
                            break;
                        case 11:
                            i += 2;
                            c1881a.m10931h(readableArray.getInt(i2));
                            break;
                        case 12:
                            i += 2;
                            c1881a.m10930g(readableArray.getInt(i2));
                            break;
                        case 13:
                            int i14 = i + 2;
                            i += 3;
                            c1881a.m10925b(readableArray.getInt(i2), readableArray.getInt(i14));
                            break;
                        case 14:
                            int i15 = i + 2;
                            int i16 = readableArray.getInt(i2);
                            i += 3;
                            int i17 = readableArray.getInt(i15);
                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i17);
                            c1881a.m10928e(i16, i17);
                            break;
                        case 15:
                            i += 2;
                            c1881a.m10936m(readableArray.getInt(i2));
                            break;
                        case 16:
                            i += 2;
                            int i18 = readableArray.getInt(i2);
                            c1881a.f17879a.remove(i18);
                            c1881a.f17881c.remove(i18);
                            break;
                        case 17:
                            int i19 = readableArray.getInt(i2);
                            int i20 = i + 3;
                            String string = readableArray.getString(i + 2);
                            i += 4;
                            c1881a.m10924a(i19, string, readableArray.getMap(i20));
                            break;
                        case 18:
                            int i21 = readableArray.getInt(i2);
                            nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i21);
                            int i22 = i + 3;
                            String string2 = readableArray.getString(i + 2);
                            i += 4;
                            c1881a.m10935l(i21, readableArray.getInt(i22), string2);
                            break;
                        case 19:
                        case 20:
                            i += 2;
                            break;
                        default:
                            throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                    }
                }
                return;
        }
    }

    public C9043cu0(NativeAnimatedModule nativeAnimatedModule, int i, ReadableArray readableArray) {
        this.f25711e = nativeAnimatedModule;
        this.f25709c = i;
        this.f25710d = readableArray;
    }
}
