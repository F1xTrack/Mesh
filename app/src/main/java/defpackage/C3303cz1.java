package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3303cz1 implements InterfaceC1880Xw0 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final C2520cT g = new C2520cT("key", AbstractC8235ym.s(F91.y(InterfaceC1107Ny1.class, new C5603ky1(1))));
    public static final C2520cT h = new C2520cT("value", AbstractC8235ym.s(F91.y(InterfaceC1107Ny1.class, new C5603ky1(2))));
    public static final C1731Vy1 i = C1731Vy1.b;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final C1731Vy1 d;
    public final C3358dG0 e = new C3358dG0(this, 1);

    public C3303cz1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C1731Vy1 c1731Vy1) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = c1731Vy1;
    }

    public static int i(C2520cT c2520cT) {
        InterfaceC1107Ny1 interfaceC1107Ny1 = (InterfaceC1107Ny1) c2520cT.b(InterfaceC1107Ny1.class);
        if (interfaceC1107Ny1 != null) {
            return ((C5603ky1) interfaceC1107Ny1).b;
        }
        throw new C8163yO("Field has no @Protobuf config");
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 a(C2520cT c2520cT, Object obj) {
        g(c2520cT, obj, true);
        return this;
    }

    public final void b(C2520cT c2520cT, double d, boolean z) throws IOException {
        if (z && d == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return;
        }
        k((i(c2520cT) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final /* synthetic */ InterfaceC1880Xw0 c(C2520cT c2520cT, boolean z) {
        h(c2520cT, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final /* synthetic */ InterfaceC1880Xw0 d(C2520cT c2520cT, int i2) {
        h(c2520cT, i2, true);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 e(C2520cT c2520cT, double d) throws IOException {
        b(c2520cT, d, true);
        return this;
    }

    @Override // defpackage.InterfaceC1880Xw0
    public final InterfaceC1880Xw0 f(C2520cT c2520cT, long j) throws IOException {
        if (j != 0) {
            InterfaceC1107Ny1 interfaceC1107Ny1 = (InterfaceC1107Ny1) c2520cT.b(InterfaceC1107Ny1.class);
            if (interfaceC1107Ny1 == null) {
                throw new C8163yO("Field has no @Protobuf config");
            }
            k(((C5603ky1) interfaceC1107Ny1).b << 3);
            l(j);
        }
        return this;
    }

    public final void g(C2520cT c2520cT, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            k((i(c2520cT) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(c2520cT, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, c2520cT, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(c2520cT, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            k((i(c2520cT) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            InterfaceC1107Ny1 interfaceC1107Ny1 = (InterfaceC1107Ny1) c2520cT.b(InterfaceC1107Ny1.class);
            if (interfaceC1107Ny1 == null) {
                throw new C8163yO("Field has no @Protobuf config");
            }
            k(((C5603ky1) interfaceC1107Ny1).b << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            h(c2520cT, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            k((i(c2520cT) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        InterfaceC1802Ww0 interfaceC1802Ww0 = (InterfaceC1802Ww0) this.b.get(obj.getClass());
        if (interfaceC1802Ww0 != null) {
            j(interfaceC1802Ww0, c2520cT, obj, z);
            return;
        }
        InterfaceC1368Rh1 interfaceC1368Rh1 = (InterfaceC1368Rh1) this.c.get(obj.getClass());
        if (interfaceC1368Rh1 != null) {
            C3358dG0 c3358dG0 = this.e;
            c3358dG0.b = false;
            c3358dG0.d = c2520cT;
            c3358dG0.c = z;
            interfaceC1368Rh1.a(obj, c3358dG0);
            return;
        }
        if (obj instanceof InterfaceC0250Cy1) {
            h(c2520cT, ((InterfaceC0250Cy1) obj).zza(), true);
        } else if (obj instanceof Enum) {
            h(c2520cT, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, c2520cT, obj, z);
        }
    }

    public final void h(C2520cT c2520cT, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        InterfaceC1107Ny1 interfaceC1107Ny1 = (InterfaceC1107Ny1) c2520cT.b(InterfaceC1107Ny1.class);
        if (interfaceC1107Ny1 == null) {
            throw new C8163yO("Field has no @Protobuf config");
        }
        k(((C5603ky1) interfaceC1107Ny1).b << 3);
        k(i2);
    }

    public final void j(InterfaceC1802Ww0 interfaceC1802Ww0, C2520cT c2520cT, Object obj, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C7081si0 c7081si0 = new C7081si0(1);
        c7081si0.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = c7081si0;
            try {
                interfaceC1802Ww0.a(obj, this);
                this.a = outputStream;
                long j = c7081si0.b;
                c7081si0.close();
                if (z && j == 0) {
                    return;
                }
                k((i(c2520cT) << 3) | 2);
                l(j);
                interfaceC1802Ww0.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c7081si0.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
