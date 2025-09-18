package p000;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* renamed from: c00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8922c00 extends AbstractC8794b00 {

    /* renamed from: e */
    public final int f17254e;

    /* renamed from: f */
    public final int f17255f;

    /* renamed from: g */
    public final int f17256g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8922c00(C0149CM c0149cm, C1546YZ c1546yz) {
        String str;
        String str2 = c0149cm.m1146a() ? AbstractC9055d00.f25753d : AbstractC9055d00.f25752c;
        try {
            switch (c1546yz.f14342a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.f17254e = -1;
            this.f17255f = -1;
            this.f17256g = -1;
            m10399a();
            int i = this.f16700a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.f17254e = iGlGetUniformLocation;
            AbstractC9055d00.m17456e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.f17256g = iGlGetAttribLocation;
            AbstractC9055d00.m17456e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f17255f = iGlGetUniformLocation2;
            AbstractC9055d00.m17456e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // p000.AbstractC8794b00
    /* renamed from: b */
    public final void mo10400b() {
        super.mo10400b();
        GLES20.glUniform1i(this.f17254e, 0);
        GLES20.glEnableVertexAttribArray(this.f17256g);
        AbstractC9055d00.m17453b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f17256g, 2, 5126, false, 0, (Buffer) AbstractC9055d00.f25758i);
        AbstractC9055d00.m17453b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8922c00(C0149CM c0149cm, EnumC8666a00 enumC8666a00) {
        C1546YZ c1546yz;
        if (c0149cm.m1146a()) {
            AbstractC9104dM1.m17545d("No default sampler shader available for" + enumC8666a00, enumC8666a00 != EnumC8666a00.f15275a);
            if (enumC8666a00 == EnumC8666a00.f15277c) {
                c1546yz = AbstractC9055d00.f25756g;
            } else {
                c1546yz = AbstractC9055d00.f25755f;
            }
        } else {
            c1546yz = AbstractC9055d00.f25754e;
        }
        this(c0149cm, c1546yz);
    }
}
