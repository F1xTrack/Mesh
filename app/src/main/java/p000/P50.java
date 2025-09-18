package p000;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class P50 extends AbstractC10012kS1 {

    /* renamed from: c */
    public static final Pattern f8848c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f8849a = AbstractC7227yr.f46511c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f8850b = AbstractC7227yr.f46510b.newDecoder();

    @Override // p000.AbstractC10012kS1
    /* renamed from: c */
    public final C7660Gr0 mo3312c(C7816Jr0 c7816Jr0, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f8850b;
        CharsetDecoder charsetDecoder2 = this.f8849a;
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
            return new C7660Gr0(new R50(null, null, bArr));
        }
        Matcher matcher = f8848c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM6357c = PN1.m6357c(strGroup);
                strM6357c.getClass();
                if (strM6357c.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM6357c.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C7660Gr0(new R50(str, str2, bArr));
    }
}
