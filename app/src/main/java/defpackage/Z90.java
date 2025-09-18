package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class Z90 extends IOException {
    public static Z90 a() {
        return new Z90("Protocol message had invalid UTF-8.");
    }

    public static W90 b() {
        return new W90("Protocol message tag had invalid wire type.");
    }

    public static Z90 c() {
        return new Z90("CodedInputStream encountered a malformed varint.");
    }

    public static Z90 d() {
        return new Z90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static Z90 e() {
        return new Z90("Failed to parse the message.");
    }

    public static Z90 f() {
        return new Z90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
