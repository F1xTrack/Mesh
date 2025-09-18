package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7056sa {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void d();

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    C6675qa g(C6675qa c6675qa);

    void h();

    boolean i();

    boolean isActive();
}
