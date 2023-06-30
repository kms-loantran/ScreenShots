import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.verifyElementVisible(
    {
      type: "Web",
      id: "84856681-2fdf-4438-aa68-febdc5f1b747",
      attributes: {
        id: "btn-make-appointment",
        href: "./index.php#appointment",
        class: "btn btn-dark btn-lg",
      },
      childIndex: 4,
      hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
      name: "a - Make Appointment",
      selectors: [
        {
          id: "ddf4b07a-9880-4394-aa84-48e3fa57e126",
          type: "CSS",
          value: "#btn-make-appointment",
          isDefault: true,
        },
        {
          id: "7689c725-b672-4710-9734-3032659d9a11",
          type: "Attribute",
          value: null,
          isDefault: true,
        },
      ],
      selectorType: "CSS",
      tag: "a",
      text: "Make Appointment",
      pageUrl: "https://katalon-demo-cura.herokuapp.com/",
      parentIframe: null,
      shadowRoot: null,
    },
    ""
  );
  await web.click({
    type: "Web",
    id: "84856681-2fdf-4438-aa68-febdc5f1b747",
    attributes: {
      id: "btn-make-appointment",
      href: "./index.php#appointment",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
    name: "a - Make Appointment",
    selectors: [
      {
        id: "ddf4b07a-9880-4394-aa84-48e3fa57e126",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "7689c725-b672-4710-9734-3032659d9a11",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "9c0aa588-35f6-4050-87fc-1da831a6e94f",
    attributes: {
      type: "text",
      class: "form-control",
      placeholder: "Username",
      "aria-describedby": "demo_username_label",
      value: "John Doe",
      readonly: "",
    },
    childIndex: 2,
    hashes: { "md5.v1": "d658d4e8da92fe56536b7b268fa72a89" },
    name: "input - Username",
    selectors: [
      {
        id: "4059c6e8-e967-425e-9825-f07a1fae0b78",
        type: "CSS",
        value: '[value="John\\ Doe"]',
        isDefault: true,
      },
      {
        id: "37e14476-db16-462b-8683-2df52fed9985",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "84024d35-c4a1-4e4f-b871-ef358f811435",
    attributes: {
      type: "text",
      class: "form-control",
      id: "txt-username",
      name: "username",
      placeholder: "Username",
      value: "",
      autocomplete: "off",
    },
    childIndex: 1,
    hashes: { "md5.v1": "57f176ba19cb19cc93acaba2dbde6b10" },
    name: "input - Username",
    selectors: [
      {
        id: "d821240a-fb98-468a-9f8e-3951d395e7ce",
        type: "CSS",
        value: "#txt-username",
        isDefault: true,
      },
      {
        id: "32fa8f86-1f23-4d5d-942e-a581e0c8c579",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.setText(
    {
      type: "Web",
      id: "84024d35-c4a1-4e4f-b871-ef358f811435",
      attributes: {
        type: "text",
        class: "form-control",
        id: "txt-username",
        name: "username",
        placeholder: "Username",
        value: "",
        autocomplete: "off",
      },
      childIndex: 1,
      hashes: { "md5.v1": "57f176ba19cb19cc93acaba2dbde6b10" },
      name: "input - Username",
      selectors: [
        {
          id: "d821240a-fb98-468a-9f8e-3951d395e7ce",
          type: "CSS",
          value: "#txt-username",
          isDefault: true,
        },
        {
          id: "32fa8f86-1f23-4d5d-942e-a581e0c8c579",
          type: "Attribute",
          value: null,
          isDefault: true,
        },
      ],
      selectorType: "CSS",
      tag: "input",
      text: "",
      pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
      parentIframe: null,
      shadowRoot: null,
    },
    "John Doe"
  );
  await web.doubleClick({
    type: "Web",
    id: "f249d7ac-4c3e-41aa-9e40-7acc699e1f80",
    attributes: {
      type: "text",
      class: "form-control",
      placeholder: "Password",
      "aria-describedby": "demo_password_label",
      value: "ThisIsNotAPassword",
      readonly: "",
    },
    childIndex: 2,
    hashes: { "md5.v1": "f6711b02ce671cc2b817baf776140264" },
    name: "input - Password",
    selectors: [
      {
        id: "8897ec51-80c2-4c10-9938-61f8bfe9e496",
        type: "CSS",
        value: '[value="ThisIsNotAPassword"]',
        isDefault: true,
      },
      {
        id: "e7719110-5aa5-4ad4-b275-8b864ab697db",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "4e03fc98-d17d-46fc-add6-98f72752aa61",
    attributes: {
      type: "password",
      class: "form-control",
      id: "txt-password",
      name: "password",
      placeholder: "Password",
      value: "",
      autocomplete: "off",
    },
    childIndex: 1,
    hashes: { "md5.v1": "fe634c654141065106a978262a410740" },
    name: "input - Password",
    selectors: [
      {
        id: "5bee3ce9-607f-42b8-ab47-ee134249d31a",
        type: "CSS",
        value: "#txt-password",
        isDefault: true,
      },
      {
        id: "f161a8af-976c-42dd-8600-6e605b877e3a",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.setEncryptedText(
    {
      type: "Web",
      id: "4e03fc98-d17d-46fc-add6-98f72752aa61",
      attributes: {
        type: "password",
        class: "form-control",
        id: "txt-password",
        name: "password",
        placeholder: "Password",
        value: "",
        autocomplete: "off",
      },
      childIndex: 1,
      hashes: { "md5.v1": "fe634c654141065106a978262a410740" },
      name: "input - Password",
      selectors: [
        {
          id: "5bee3ce9-607f-42b8-ab47-ee134249d31a",
          type: "CSS",
          value: "#txt-password",
          isDefault: true,
        },
        {
          id: "f161a8af-976c-42dd-8600-6e605b877e3a",
          type: "Attribute",
          value: null,
          isDefault: true,
        },
      ],
      selectorType: "CSS",
      tag: "input",
      text: "",
      pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
      parentIframe: null,
      shadowRoot: null,
    },
    "b3743f05d5761bf6ea704f2db83473be-U2FsdGVkX1/cXawr7z0aqXruRbdntOFDYZ6u93zmepJEhIR87Utay7P2nH5swfDm"
  );
  await web.click({
    type: "Web",
    id: "7b0b6bca-5f4e-4d9f-add5-770e9d0331f9",
    attributes: { id: "btn-login", type: "submit", class: "btn btn-default" },
    childIndex: 1,
    hashes: { "md5.v1": "50aa64147a00037c420def1e18673ac9" },
    name: "button - Login",
    selectors: [
      {
        id: "68c01a93-991d-4864-b2b4-4c323e1c73fb",
        type: "CSS",
        value: "#btn-login",
        isDefault: true,
      },
      {
        id: "cddd6a67-e80b-4a78-9cb0-dbf8c6e1034e",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Login",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/profile.php#login",
    parentIframe: null,
    shadowRoot: null,
  });
});