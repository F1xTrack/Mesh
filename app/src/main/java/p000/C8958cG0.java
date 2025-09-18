package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8958cG0 implements InterfaceC8554Xw0 {

    /* renamed from: f */
    public static final Charset f17400f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C1849cT f17401g = new C1849cT("key", AbstractC7222ym.m26242s(AbstractC7222ym.m26241r(XF0.class, new C0136C9(1))));

    /* renamed from: h */
    public static final C1849cT f17402h = new C1849cT("value", AbstractC7222ym.m26242s(AbstractC7222ym.m26241r(XF0.class, new C0136C9(2))));

    /* renamed from: i */
    public static final C10031kc0 f17403i = new C10031kc0(1);

    /* renamed from: a */
    public OutputStream f17404a;

    /* renamed from: b */
    public final HashMap f17405b;

    /* renamed from: c */
    public final HashMap f17406c;

    /* renamed from: d */
    public final C10031kc0 f17407d;

    /* renamed from: e */
    public final C9091dG0 f17408e = new C9091dG0(this, 0);

    public C8958cG0(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C10031kc0 c10031kc0) {
        this.f17404a = byteArrayOutputStream;
        this.f17405b = map;
        this.f17406c = map2;
        this.f17407d = c10031kc0;
    }

    /* renamed from: j */
    public static int m10630j(C1849cT c1849cT) {
        XF0 xf0 = (XF0) c1849cT.m10702b(XF0.class);
        if (xf0 != null) {
            return ((C0136C9) xf0).f1227b;
        }
        throw new C7198yO("Field has no @Protobuf config");
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: a */
    public final InterfaceC8554Xw0 mo4359a(C1849cT c1849cT, Object obj) {
        m10633h(c1849cT, obj, true);
        return this;
    }

    /* renamed from: b */
    public final void m10631b(C1849cT c1849cT, double d, boolean z) throws IOException {
        if (z && d == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return;
        }
        m10635k((m10630j(c1849cT) << 3) | 1);
        this.f17404a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: c */
    public final InterfaceC8554Xw0 mo4361c(C1849cT c1849cT, boolean z) {
        m10632g(c1849cT, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: d */
    public final InterfaceC8554Xw0 mo4362d(C1849cT c1849cT, int i) {
        m10632g(c1849cT, i, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: e */
    public final InterfaceC8554Xw0 mo4363e(C1849cT c1849cT, double d) throws IOException {
        m10631b(c1849cT, d, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: f */
    public final InterfaceC8554Xw0 mo4364f(C1849cT c1849cT, long j) throws IOException {
        if (j != 0) {
            XF0 xf0 = (XF0) c1849cT.m10702b(XF0.class);
            if (xf0 == null) {
                throw new C7198yO("Field has no @Protobuf config");
            }
            m10635k(((C0136C9) xf0).f1227b << 3);
            m10636l(j);
        }
        return this;
    }

    /* renamed from: g */
    public final void m10632g(C1849cT c1849cT, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        XF0 xf0 = (XF0) c1849cT.m10702b(XF0.class);
        if (xf0 == null) {
            throw new C7198yO("Field has no @Protobuf config");
        }
        m10635k(((C0136C9) xf0).f1227b << 3);
        m10635k(i);
    }

    /* renamed from: h */
    public final void m10633h(C1849cT c1849cT, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m10635k((m10630j(c1849cT) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f17400f);
            m10635k(bytes.length);
            this.f17404a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m10633h(c1849cT, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10634i(f17403i, c1849cT, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m10631b(c1849cT, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m10635k((m10630j(c1849cT) << 3) | 5);
            this.f17404a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            XF0 xf0 = (XF0) c1849cT.m10702b(XF0.class);
            if (xf0 == null) {
                throw new C7198yO("Field has no @Protobuf config");
            }
            m10635k(((C0136C9) xf0).f1227b << 3);
            m10636l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m10632g(c1849cT, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m10635k((m10630j(c1849cT) << 3) | 2);
            m10635k(bArr.length);
            this.f17404a.write(bArr);
            return;
        }
        InterfaceC8502Ww0 interfaceC8502Ww0 = (InterfaceC8502Ww0) this.f17405b.get(obj.getClass());
        if (interfaceC8502Ww0 != null) {
            m10634i(interfaceC8502Ww0, c1849cT, obj, z);
            return;
        }
        InterfaceC8213Rh1 interfaceC8213Rh1 = (InterfaceC8213Rh1) this.f17406c.get(obj.getClass());
        if (interfaceC8213Rh1 != null) {
            C9091dG0 c9091dG0 = this.f17408e;
            c9091dG0.f25917b = false;
            c9091dG0.f25919d = c1849cT;
            c9091dG0.f25918c = z;
            interfaceC8213Rh1.mo104a(obj, c9091dG0);
            return;
        }
        if (obj instanceof TF0) {
            m10632g(c1849cT, ((TF0) obj).mo7649a(), true);
        } else if (obj instanceof Enum) {
            m10632g(c1849cT, ((Enum) obj).ordinal(), true);
        } else {
            m10634i(this.f17407d, c1849cT, obj, z);
        }
    }

    /* renamed from: i */
    public final void m10634i(InterfaceC8502Ww0 interfaceC8502Ww0, C1849cT c1849cT, Object obj, boolean z) throws IOException {
        C11067si0 c11067si0 = new C11067si0(0);
        c11067si0.f42555b = 0L;
        try {
            OutputStream outputStream = this.f17404a;
            this.f17404a = c11067si0;
            try {
                interfaceC8502Ww0.mo104a(obj, this);
                this.f17404a = outputStream;
                long j = c11067si0.f42555b;
                c11067si0.close();
                if (z && j == 0) {
                    return;
                }
                m10635k((m10630j(c1849cT) << 3) | 2);
                m10636l(j);
                interfaceC8502Ww0.mo104a(obj, this);
            } catch (Throwable th) {
                this.f17404a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c11067si0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: k */
    public final void m10635k(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f17404a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f17404a.write(i & 127);
    }

    /* renamed from: l */
    public final void m10636l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f17404a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f17404a.write(((int) j) & 127);
    }
}
