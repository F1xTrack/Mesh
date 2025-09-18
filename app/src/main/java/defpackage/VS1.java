package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class VS1 extends IOException {
    public static final /* synthetic */ int a = 0;

    public static VS1 a() {
        return new VS1("Protocol message had invalid UTF-8.");
    }

    public static VS1 b() {
        return new VS1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static VS1 c() {
        return new VS1("Failed to parse the message.");
    }

    public static VS1 d() {
        return new VS1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
