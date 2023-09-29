package org.iesvdm.haversine;

public class Posicion {
    private float latitud;
    private float longitud;

    public Posicion(float latitud, float longitud)
    {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    //Creamos la clase Extensiones
    public class Extensiones
    {
        public static final float RadioTierraKm = 6378.0F;

        public static float distanciaKm(Posicion posOrigen, Posicion posDestino)
        {
            float difLatitud = enRadianes(posDestino.getLatitud() - posOrigen.getLatitud());
            float difLongitud = enRadianes(posDestino.getLongitud() - posOrigen.getLongitud());

            double a = Math.pow(Math.sin(difLatitud / 2), 2) +
                    Math.cos(enRadianes(posOrigen.getLatitud())) *
                    Math.cos(enRadianes(posDestino.getLatitud())) *
                    Math.pow(Math.sin(difLongitud / 2), 2);

            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

            return RadioTierraKm * (float) c;
        }

        private static float enRadianes(float valor) {
            return (float) (Math.PI / 180) * valor;
        }
    }

}


