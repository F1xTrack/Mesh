package p000;

import java.io.IOException;

/* loaded from: classes.dex */
public class VS1 extends IOException {

    /* renamed from: a */
    public static final /* synthetic */ int f12585a = 0;

    /* renamed from: a */
    public static VS1 m8439a() {
        return new VS1("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static VS1 m8440b() {
        return new VS1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static VS1 m8441c() {
        return new VS1("Failed to parse the message.");
    }

    /* renamed from: d */
    public static VS1 m8442d() {
        return new VS1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
