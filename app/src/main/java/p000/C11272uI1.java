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

/* renamed from: uI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11272uI1 implements InterfaceC8554Xw0 {

    /* renamed from: f */
    public static final Charset f43635f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C1849cT f43636g = new C1849cT("key", AbstractC7222ym.m26242s(F91.m2543z(InterfaceC10760qI1.class, new XH1(1))));

    /* renamed from: h */
    public static final C1849cT f43637h = new C1849cT("value", AbstractC7222ym.m26242s(F91.m2543z(InterfaceC10760qI1.class, new XH1(2))));

    /* renamed from: i */
    public static final C8455Vy1 f43638i = new C8455Vy1(2);

    /* renamed from: a */
    public OutputStream f43639a;

    /* renamed from: b */
    public final HashMap f43640b;

    /* renamed from: c */
    public final HashMap f43641c;

    /* renamed from: d */
    public final C8455Vy1 f43642d;

    /* renamed from: e */
    public final C9091dG0 f43643e = new C9091dG0(this, 2);

    public C11272uI1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C8455Vy1 c8455Vy1) {
        this.f43639a = byteArrayOutputStream;
        this.f43640b = map;
        this.f43641c = map2;
        this.f43642d = c8455Vy1;
    }

    /* renamed from: i */
    public static int m25159i(C1849cT c1849cT) {
        InterfaceC10760qI1 interfaceC10760qI1 = (InterfaceC10760qI1) c1849cT.m10702b(InterfaceC10760qI1.class);
        if (interfaceC10760qI1 != null) {
            return ((XH1) interfaceC10760qI1).f13664b;
        }
        throw new C7198yO("Field has no @Protobuf config");
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: a */
    public final InterfaceC8554Xw0 mo4359a(C1849cT c1849cT, Object obj) {
        m25161g(c1849cT, obj, true);
        return this;
    }

    /* renamed from: b */
    public final void m25160b(C1849cT c1849cT, double d, boolean z) throws IOException {
        if (z && d == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return;
        }
        m25164k((m25159i(c1849cT) << 3) | 1);
        this.f43639a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: c */
    public final /* synthetic */ InterfaceC8554Xw0 mo4361c(C1849cT c1849cT, boolean z) {
        m25162h(c1849cT, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: d */
    public final /* synthetic */ InterfaceC8554Xw0 mo4362d(C1849cT c1849cT, int i) {
        m25162h(c1849cT, i, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: e */
    public final InterfaceC8554Xw0 mo4363e(C1849cT c1849cT, double d) throws IOException {
        m25160b(c1849cT, d, true);
        return this;
    }

    @Override // p000.InterfaceC8554Xw0
    /* renamed from: f */
    public final InterfaceC8554Xw0 mo4364f(C1849cT c1849cT, long j) throws IOException {
        if (j != 0) {
            InterfaceC10760qI1 interfaceC10760qI1 = (InterfaceC10760qI1) c1849cT.m10702b(InterfaceC10760qI1.class);
            if (interfaceC10760qI1 == null) {
                throw new C7198yO("Field has no @Protobuf config");
            }
            m25164k(((XH1) interfaceC10760qI1).f13664b << 3);
            m25165l(j);
        }
        return this;
    }

    /* renamed from: g */
    public final void m25161g(C1849cT c1849cT, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m25164k((m25159i(c1849cT) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f43635f);
            m25164k(bytes.length);
            this.f43639a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m25161g(c1849cT, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m25163j(f43638i, c1849cT, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m25160b(c1849cT, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m25164k((m25159i(c1849cT) << 3) | 5);
            this.f43639a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            InterfaceC10760qI1 interfaceC10760qI1 = (InterfaceC10760qI1) c1849cT.m10702b(InterfaceC10760qI1.class);
            if (interfaceC10760qI1 == null) {
                throw new C7198yO("Field has no @Protobuf config");
            }
            m25164k(((XH1) interfaceC10760qI1).f13664b << 3);
            m25165l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m25162h(c1849cT, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m25164k((m25159i(c1849cT) << 3) | 2);
            m25164k(bArr.length);
            this.f43639a.write(bArr);
            return;
        }
        InterfaceC8502Ww0 interfaceC8502Ww0 = (InterfaceC8502Ww0) this.f43640b.get(obj.getClass());
        if (interfaceC8502Ww0 != null) {
            m25163j(interfaceC8502Ww0, c1849cT, obj, z);
            return;
        }
        InterfaceC8213Rh1 interfaceC8213Rh1 = (InterfaceC8213Rh1) this.f43641c.get(obj.getClass());
        if (interfaceC8213Rh1 != null) {
            C9091dG0 c9091dG0 = this.f43643e;
            c9091dG0.f25917b = false;
            c9091dG0.f25919d = c1849cT;
            c9091dG0.f25918c = z;
            interfaceC8213Rh1.mo104a(obj, c9091dG0);
            return;
        }
        if (obj instanceof InterfaceC10248mI1) {
            m25162h(c1849cT, ((InterfaceC10248mI1) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m25162h(c1849cT, ((Enum) obj).ordinal(), true);
        } else {
            m25163j(this.f43642d, c1849cT, obj, z);
        }
    }

    /* renamed from: h */
    public final void m25162h(C1849cT c1849cT, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        InterfaceC10760qI1 interfaceC10760qI1 = (InterfaceC10760qI1) c1849cT.m10702b(InterfaceC10760qI1.class);
        if (interfaceC10760qI1 == null) {
            throw new C7198yO("Field has no @Protobuf config");
        }
        m25164k(((XH1) interfaceC10760qI1).f13664b << 3);
        m25164k(i);
    }

    /* renamed from: j */
    public final void m25163j(InterfaceC8502Ww0 interfaceC8502Ww0, C1849cT c1849cT, Object obj, boolean z) throws IOException {
        C11067si0 c11067si0 = new C11067si0(2);
        c11067si0.f42555b = 0L;
        try {
            OutputStream outputStream = this.f43639a;
            this.f43639a = c11067si0;
            try {
                interfaceC8502Ww0.mo104a(obj, this);
                this.f43639a = outputStream;
                long j = c11067si0.f42555b;
                c11067si0.close();
                if (z && j == 0) {
                    return;
                }
                m25164k((m25159i(c1849cT) << 3) | 2);
                m25165l(j);
                interfaceC8502Ww0.mo104a(obj, this);
            } catch (Throwable th) {
                this.f43639a = outputStream;
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
    public final void m25164k(int i) throws IOException {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) == 0) {
                this.f43639a.write(i2);
                return;
            } else {
                this.f43639a.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    /* renamed from: l */
    public final void m25165l(long j) throws IOException {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.f43639a.write(i);
                return;
            } else {
                this.f43639a.write(i | 128);
                j >>>= 7;
            }
        }
    }
}
