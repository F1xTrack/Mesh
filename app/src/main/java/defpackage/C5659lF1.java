package defpackage;

import java.io.IOException;

/* renamed from: lF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5659lF1 extends IOException {
    public static final /* synthetic */ int a = 0;

    public static C5659lF1 a() {
        return new C5659lF1("Protocol message had invalid UTF-8.");
    }

    public static C5659lF1 b() {
        return new C5659lF1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C5659lF1 c() {
        return new C5659lF1("Failed to parse the message.");
    }

    public static C5659lF1 d() {
        return new C5659lF1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
