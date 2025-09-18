package p000;

import java.io.IOException;

/* loaded from: classes.dex */
public class Z90 extends IOException {
    /* renamed from: a */
    public static Z90 m9496a() {
        return new Z90("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static W90 m9497b() {
        return new W90("Protocol message tag had invalid wire type.");
    }

    /* renamed from: c */
    public static Z90 m9498c() {
        return new Z90("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static Z90 m9499d() {
        return new Z90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static Z90 m9500e() {
        return new Z90("Failed to parse the message.");
    }

    /* renamed from: f */
    public static Z90 m9501f() {
        return new Z90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
