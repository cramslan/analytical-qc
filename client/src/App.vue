<template>
  <v-app>
    <v-app-bar app color="primary" dark>
      <div class="d-flex align-center">Analytical QC</div>
    </v-app-bar>

    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script>
export default {
  name: "App",
};
</script>