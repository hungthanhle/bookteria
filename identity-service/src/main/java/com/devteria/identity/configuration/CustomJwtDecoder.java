package com.devteria.identity.configuration;

// import java.text.ParseException;

// import com.nimbusds.jwt.SignedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtException;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;

@Component
public class CustomJwtDecoder implements JwtDecoder {
    @Value("${jwt.signerKey}")
    private String signerKey;

    private NimbusJwtDecoder nimbusJwtDecoder = null;

    @Override
    public Jwt decode(String token) throws JwtException {
        try {
            // SignedJWT signedJWT = SignedJWT.parse(token);

            // return new Jwt(token,
            //         signedJWT.getJWTClaimsSet().getIssueTime().toInstant(),
            //         signedJWT.getJWTClaimsSet().getExpirationTime().toInstant(),
            //         signedJWT.getHeader().toJSONObject(),
            //         signedJWT.getJWTClaimsSet().getClaims()
            // );

            SecretKeySpec secretKeySpec = new SecretKeySpec(signerKey.getBytes(), "HS512");
            nimbusJwtDecoder = NimbusJwtDecoder.withSecretKey(secretKeySpec)
                    .macAlgorithm(MacAlgorithm.HS512)
                    .build();

            return nimbusJwtDecoder.decode(token);
        } catch (Exception e) {
            throw new JwtException("Invalid token");
        }
    }
}
