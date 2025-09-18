package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class P50 extends AbstractC5507kS1 {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a = AbstractC8250yr.c.newDecoder();
    public final CharsetDecoder b = AbstractC8250yr.b.newDecoder();

    @Override // defpackage.AbstractC5507kS1
    public final C0540Gr0 c(C0774Jr0 c0774Jr0, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.b;
        CharsetDecoder charsetDecoder2 = this.a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C0540Gr0(new R50(null, null, bArr));
        }
        Matcher matcher = c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strC = PN1.c(strGroup);
                strC.getClass();
                if (strC.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strC.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C0540Gr0(new R50(str, str2, bArr));
    }
}
